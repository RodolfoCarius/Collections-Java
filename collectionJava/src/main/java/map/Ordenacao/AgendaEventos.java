package main.java.map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

	private Map<LocalDate, Evento> eventosMap;

	public AgendaEventos() {
		this.eventosMap = new HashMap<>();
	}
	
	public void adicionarEvento(LocalDate data, String nome, String atracao) {
		eventosMap.put(data, new Evento(nome, atracao));
	}
	
	public void exibirAgenda() {
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
		System.out.println(eventosTreeMap);
		
	}
	
	public void obterProximoEvento() {
		LocalDate dataAtual = LocalDate.now();
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
		for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
			if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
				LocalDate proximaData = entry.getKey();
				Evento proximoEvento = entry.getValue();
				System.out.println("O próximo evento " + proximoEvento + "acontecera na data " + proximaData);
				break;	
			}
		}
	}
	
	
	public static void main(String[] args) {
		AgendaEventos agendaEventos = new AgendaEventos();
		
		agendaEventos.adicionarEvento(LocalDate.of(2022, Month.APRIL, 15), "niver", "DJ");
		agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 10), "evento 2", "Luzes");
		agendaEventos.adicionarEvento(LocalDate.of(2022, Month.SEPTEMBER, 07), "Festa 3.0r", "Comida");
		agendaEventos.adicionarEvento(LocalDate.of(2023, Month.NOVEMBER, 15), "niver", "DJ");
		
		agendaEventos.exibirAgenda();
		
		agendaEventos.obterProximoEvento();
		
	}
}
