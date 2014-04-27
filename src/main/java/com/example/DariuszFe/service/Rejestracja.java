package com.example.DariuszFe.service;

import java.util.ArrayList;
import java.util.List;

import com.example.DariuszFe.domain.rejestracja;

public class Rejestracja {

	private static List<rejestracja> db = new ArrayList<rejestracja>();

	public Rejestracja() {

	}

	public static List<rejestracja> getInstance() {

		return db;
	}

}		