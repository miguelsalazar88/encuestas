package launcher;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

import modelo.Extraer;

import modelo.SistemaSingleton;
import modelo.Usuario;
import modelo.Encuesta;
import modelo.Pregunta;

import modelo.Respuesta;
import modelo.RespuestaSiNo;
import modelo.RespuestaMultipleChoice;
import modelo.RespuestaMatriz;
import modelo.RespuestaTexto;



public class ExtraerEncuestas {
	
	private Extraer extraer = new Extraer();
	
	public HashSet<Encuesta> ExtraerEncuestas (SistemaSingleton s) {
		
		ArrayList<Usuario> users = s.getUsuarios();
		HashSet<Encuesta> encuestas = new HashSet<Encuesta>(); 
		
		/*
		 * 1. iterar en los usuarios
		 * 2. por cada usuario, extraer la lista de encuestas
		 * 3. por cada lista de encuestas, añadir al Set las encuestas
		 */
		
		for (Usuario u : users) {
			for(Encuesta e : u.getEncuestas()) {
				encuestas.add(e);
			}
		}
		
		return encuestas;
	}
	

	public HashMap<String, ArrayList<Respuesta>> obtenerPreguntas(Encuesta e) {
		
		/*La estructura de cada encuesta es un Mapa. La clave es la pregunta y las respuestas con las respuestas.*/
		HashMap< String, ArrayList<Respuesta>> listado = new HashMap();
		
		/*
		 * 1. Iterar en las preguntas
		 * 2. Extraer en clave el String de la pregunta
		 * 3. Extraer la lista de respuestas para esa pregunta.
		 * */
		for(Pregunta p : e.getPreguntas()) {
			listado.put(p.getPregunta(), p.getRespuestas());
		}
		
		return listado;
	}
	
	public void buscarEncuesta( ArrayList<Usuario> users, String titulo) {
		
		HashMap<String,ArrayList<Respuesta>> listado = null;
		
		/*
		 * 1. Ir por cada usuario
		 * 2. Buscar en sus encuestas
		 * 3. Si se encuentra la encuesta, extraer las preguntas y respuestas.
		 * */
		for(Usuario u :users) {
			for(Encuesta e : u.getEncuestas()) {
				if(e.getTitulo().equalsIgnoreCase(titulo)) {
					listado = obtenerPreguntas(e);
				}
			}
		}
	}
	
	public HashMap<String, HashMap<String,Integer>> contarRespuestas(String nombEncuesta, HashMap<String,ArrayList<Respuesta>> listado, SistemaSingleton sistema) {
		HashMap<String, HashMap<String,Integer>> conteo = new HashMap<>();
		/*
		 * 1. Ir por cada pregunta.
		 * 2. Ver el conjunto de respuestas
		 * 3. Extraer el tipo de respuesta 
		 * 4. Contar según el tipo de respuesta.
		 * 5. Meter el mapa de respuestas contadas con su pregunta.
		 * */
		for(String s: listado.keySet()) {
			for(Respuesta r : listado.get(s)) {
				int a = 10; //10 letras en Respuesta.
				String tipo = extraer.ExtraerTipo(r, a);
				
				if(tipo.equalsIgnoreCase("SiNo")) {
					RespuestaSiNo res = (RespuestaSiNo) r;
					HashMap<String,Integer> resSiNo = contarSiNo(nombEncuesta, sistema, s, res);
					conteo.put(s, resSiNo);
				}else if(tipo.equalsIgnoreCase("MultipleChoice")) {
					RespuestaMultipleChoice res = (RespuestaMultipleChoice) r;
					HashMap<String,Integer> resMultiple = contarMultiple(nombEncuesta, sistema, s, res);
					conteo.put(s, resMultiple);
				}else if(tipo.equalsIgnoreCase("Texto")) {
					RespuestaTexto res = (RespuestaTexto) r;
					HashMap<String,Integer> resTexto = contarTexto(nombEncuesta, sistema, s, res);
					conteo.put(s, resTexto);
				}else if(tipo.equalsIgnoreCase("Matriz")) {
					RespuestaMatriz res = (RespuestaMatriz) r;
					HashMap<String,Integer> resMatriz = contarMatriz(nombEncuesta, sistema, s, res);
					conteo.put(s, resMatriz);
				}else {
					break;
				}
			}
		}
		
		return conteo;
	}
	
	
	
	public HashMap<String,Integer> contarSiNo(String nombEncuesta, SistemaSingleton s, String pregunta, RespuestaSiNo r) {
		
		//Mapa para almacenar los valores de cada respuesta
		HashMap<String, Integer> respuestas = new HashMap();
		
		int a=0;
		int b=0;
		int c=0;
		
		/*
		 * 1. buscar entre todos los usuarios
		 * 2. buscar la encuesta
		 * 3. buscar la pregunta
		 * 4. contar
		 * 5. añadir a respuestas
		 * */
		for(Usuario u: s.getUsuarios()) {
			for(Encuesta e :u.getEncuestas()) {
				if(e.getTitulo().equalsIgnoreCase(nombEncuesta)) {
					for(Pregunta p: e.getPreguntas()) {
						// 0 para sÃ­, 1 para no, 2 para no sabe/no responde
						if(r.getSiNoNs()==0) {
							a++;
						}else if(r.getSiNoNs()==1) {
							b++;
						}else if(r.getSiNoNs()==2) {
							c++;
						}
					}
				}
			}
		}
		
	
		respuestas.put("Si", a);
		respuestas.put("No", b);
		respuestas.put("No sabe no responde", c);
		
		return respuestas;
	}
	
	public HashMap<String,Integer> contarTexto(String nombEncuesta, SistemaSingleton s, String pregunta, RespuestaTexto r) {
		HashMap<String,Integer> resTexto = new HashMap();
		
		HashSet<String> respuestas = new HashSet();
		
		int contador;
		/*
		 * 1. buscar entre todos los usuarios
		 * 2. buscar la encuesta
		 * 3. buscar la pregunta
		 * 4. buscar las posibles respuestas
		 * 5. añadir a la lista de respuestas
		 * */
		for(Usuario u: s.getUsuarios()) {
			for(Encuesta e: u.getEncuestas()) {
				if(e.getTitulo().equalsIgnoreCase(nombEncuesta)) {
					for(Pregunta p: e.getPreguntas()) {
						if(p.getPregunta().equalsIgnoreCase(pregunta)) {
							for(Respuesta res: p.getRespuestas()) {
								RespuestaTexto aux = (RespuestaTexto) res;
								respuestas.add(aux.getRespuesta());
							}
						}
					}
				}
			}
		}
		
		/*
		 * 1. buscar entre todos los usuarios
		 * 2. buscar la encuesta
		 * 3. buscar la pregunta
		 * 4. iterar entre las respuestas
		 * 5. iterar entre las respuestas guardadas
		 * 6. sumar 1 a cada vez que la respuesta se repita.
		 * */
		for(Usuario u: s.getUsuarios()) {
			for(Encuesta e: u.getEncuestas()) {
				if(e.getTitulo().equalsIgnoreCase(nombEncuesta)) {
					for(Pregunta p: e.getPreguntas()) {
						if(p.getPregunta().equalsIgnoreCase(pregunta)) {
							for(Respuesta res: p.getRespuestas()) {
								RespuestaTexto aux = (RespuestaTexto) res;
								contador=0;
								for(String s1: respuestas) {
									if(s1.equalsIgnoreCase(aux.getRespuesta())) {
										contador++;
									}
									resTexto.put(pregunta, contador);
								}
							}
						}
					}
				}
			}
		}
		
		return resTexto;
	}
	
	public HashMap<String,Integer> contarMatriz(String nombEncuesta, SistemaSingleton s, String pregunta, RespuestaMatriz r) {
		HashMap<String,Integer> resMatriz = new HashMap();
		
		//La matriz tendrá un 0 o un 1 dependiendo si está o no marcada la intersección.
		int[][] matriz = r.getMatrizRespuesta();
		
		for(int i=0; i < matriz.length; i++) {
			 for (int j = 0; j < matriz[i].length; j++) {
			       
			    }
		}
		
		
		
		return resMatriz;
	}
	
	public HashMap<String,Integer> contarMultiple(String nombEncuesta, SistemaSingleton s, String pregunta, RespuestaMultipleChoice r) {
		HashMap<String,Integer> resMultiple = new HashMap();
		
		HashSet<String> respuestas = new HashSet();
		
		int contador;
		/*
		 * 1. buscar entre todos los usuarios
		 * 2. buscar la encuesta
		 * 3. buscar la pregunta
		 * 4. buscar las posibles respuestas
		 * 5. añadir a la lista de respuestas
		 * */
		for(Usuario u: s.getUsuarios()) {
			for(Encuesta e: u.getEncuestas()) {
				if(e.getTitulo().equalsIgnoreCase(nombEncuesta)) {
					for(Pregunta p: e.getPreguntas()) {
						if(p.getPregunta().equalsIgnoreCase(pregunta)) {
							for(Respuesta res: p.getRespuestas()) {
								RespuestaMultipleChoice aux = (RespuestaMultipleChoice) res;
								String op = String.valueOf(aux.getOpcion());
								respuestas.add(op);
							}
						}
					}
				}
			}
		}
		
		
		/*
		 * 1. buscar entre todos los usuarios
		 * 2. buscar la encuesta
		 * 3. buscar la pregunta
		 * 4. iterar entre las respuestas
		 * 5. iterar entre las respuestas guardadas
		 * 6. sumar 1 a cada vez que la respuesta se repita.
		 * */
		for(Usuario u: s.getUsuarios()) {
			for(Encuesta e: u.getEncuestas()) {
				if(e.getTitulo().equalsIgnoreCase(nombEncuesta)) {
					for(Pregunta p: e.getPreguntas()) {
						if(p.getPregunta().equalsIgnoreCase(pregunta)) {
							for(Respuesta res: p.getRespuestas()) {
								RespuestaMultipleChoice aux = (RespuestaMultipleChoice) res;
								contador=0;
								for(String s1: respuestas) {
									if(s1.equalsIgnoreCase(String.valueOf(aux.getOpcion()))) {
										contador++;
									}
									resMultiple.put(pregunta, contador);
								}
							}
						}
					}
				}
			}
		}
		
		
		return resMultiple;
	}
	
	
	
	
}
