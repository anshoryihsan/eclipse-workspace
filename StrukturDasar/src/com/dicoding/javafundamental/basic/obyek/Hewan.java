package com.dicoding.javafundamental.basic.obyek;

public class Hewan {
	String nama;
	int berat;
	int jumlahKaki;

	public Hewan(String namaHewan) {
		this.nama = namaHewan;
	}

	public void beratHewan(int beratHewan) {
		this.berat = beratHewan;
	}

	public void jumlahKakiHewan(int jumlahKakiHewan) {
		this.jumlahKaki = jumlahKakiHewan;
	}

	public void cetakHewan() {
		System.out.println("Nama heawan : " + nama);
		System.out.println("Berat hewan : " + berat + "kg");
		System.out.println("Jumlah Kaki : " + jumlahKaki);
	}
}
