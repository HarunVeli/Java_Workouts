
		
		
		package Odev;

		import java.io.BufferedReader;
		import java.io.File;
		import java.io.FileReader;
		import java.io.IOException;
		import java.util.ArrayList;
		import java.util.Scanner;

		public class AnaSayfa {

			public static void main(String[] args) throws IOException {
				ArrayList<Kurs> kurs = new ArrayList<Kurs>();
				ArrayList<Kurs> kurs1 = new ArrayList<Kurs>();
				ArrayList<kursiyer> kursiyer = new ArrayList<Kursiyer>();
				String line1, line2;
				String kursID = null;
				String kursiyerID;
				String kursiyerYas;
				String kursiyerAdSoyad, kursAd = null;
				int i = 1, j = 1;
				Scanner scan = new Scanner(System.in);

				try {
					File myFile = new File("Kurs.txt");
					if (!myFile.exists()) {
						myFile.createNewFile();

					}
					FileReader fr1 = new FileReader("Kurs.txt");
					BufferedReader br1 = new BufferedReader(fr1);
					while ((line1 = br1.readLine()) != null) {
						/*
						 * System.out.println(line1); System.out.println(br1.readLine());
						 */

						kursID = "";
						kursAd = "";
						// System.out.println(line1.length());
						i = 0;
						if (line1.length() == 0) {
							break;
						}
						while (true) {

							if (line1.charAt(i) == '-') {
								break;
							}

							kursID += line1.charAt(i);

							i += 1;

						}
						// System.out.println(kursID);
						while (true) {

							i += 1;

							if (i == line1.length()) {
								break;
							}
							kursAd += line1.charAt(i);

						}
						System.out.println(kursID + "-" + kursAd);
						kurs.add(new Kurs(Integer.parseInt(kursID), kursAd));

					}
					fr1.close();
					br1.close();

				} catch (Exception e) {
					e.printStackTrace();
				}
				try {
					File myFile1 = new File("Kursiyer.txt");
					if (!myFile1.exists()) {
						myFile1.createNewFile();

					}

					FileReader fr2 = new FileReader("Kursiyer.txt");
					BufferedReader br2 = new BufferedReader(fr2);
					while ((line2 = br2.readLine()) != null) {

						// System.out.println(line2);
						kursiyerID = "";
						kursiyerAdSoyad = "";
						kursiyerYas = "";
						j = 1;

						if (line2.charAt(0) == '*') {
							while (true) {

								if (line2.charAt(j) == '-') {
									break;
								}
								kursiyerID += line2.charAt(j);

								j += 1;
							}

							while (true) {

								j += 1;

								if (line2.charAt(j) == '-') {
									break;
								}
								kursiyerAdSoyad += line2.charAt(j);

							}
							while (true) {

								j += 1;

								if (j == line2.length()) {
									break;
								}
								kursiyerYas += line2.charAt(j);
							}
							
							
						} else if (line2.charAt(0) == '%') {
							kursID = "";
							kursAd = "";
							j = 1;
							while (true) {
								if (line2.charAt(j) == '-') {
									break;
								}
								kursID += line2.charAt(j);
								j += 1;
							}

							while (true) {
								j += 1;
								if (j == line2.length()) {
									break;
								}
								kursAd += line2.charAt(j);
							}
							kurs1.add(new Kurs(Integer.parseInt(kursID), kursAd));
							temp.
						}

						if (kursiyerID == "" | kursiyerAdSoyad == "" | kursiyerYas == "") {
							// System.out.println(kursID + "-" + kursAd);
							continue;

						} else {

							kursiyer.add(new Kursiyer(Integer.parseInt(kursiyerID), kursiyerAdSoyad,
									Integer.parseInt(kursiyerYas), kurs1));
							Kursiyer temp= kursiyer.get(k);
							
							// kurs1.clear();

							// System.out.println(kursiyerID + "-" + kursiyerAdSoyad + "-" + kursiyerYas);

						}

					}
					fr2.close();
					br2.close();

				} catch (Exception e) {
					e.printStackTrace();
				}
				boolean dongu = true;
				while (dongu) {
					System.out.println("------------MENU------------");
					System.out.println("1- Kurs Ekle");
					System.out.println("2- Kurs Listele");
					System.out.println("3- Kursiyer Ekle");
					System.out.println("4- Kursiyer Ara");
					System.out.println("5- Kursiyer Sil");
					System.out.println("6- Kursiyerleri Listele");
					System.out.println("7- Kursiyerleri Ayrintili Listele");
					System.out.println("8- Kursiyerin Odeyecegi Tutari Hesapla");
					System.out.println("9- Cikis");
					int secim;
					System.out.print("Yukaridakilerden hangisini yapmak istersiniz ? = ");
					secim = scan.nextInt();
					scan.nextLine();
					switch (secim) {
					case 1:

						System.out.print("\nEklenecek kurs ID : ");
						String kurs_id = scan.nextLine();
						System.out.print("\n" + "Eklenecek kurs ad : ");
						String kurs_ad = scan.nextLine();
						kurs = Kurs.ekle(kurs, Integer.parseInt(kurs_id), kurs_ad);

						System.out.println("Menuye donmek icin Enter'e basiniz. ");
						scan.nextLine();
						break;

					case 2:

						System.out.println("Kurs Id" + "     " + "Kurs Adi");
						Kurs.listele(kurs);
						System.out.println("Menuye donmek icin enter'a basiniz.");
						scan.nextLine();
						break;

					case 3:
						int id = 0;
						int yas = 0;
						String adSoyad_ = "";
						ArrayList<Kurs> kurslar = new ArrayList<Kurs>();
						System.out.print("Kursiyer ID =");
						id += scan.nextInt();
						scan.nextLine();
						System.out.print("Kursiyer Ad ve Soyad = ");
						adSoyad_ += scan.nextLine();
						System.out.println("Kursiyer Yas =");
						yas += scan.nextInt();
						scan.nextLine();
						System.out.println("Girmiþ olduðunuz kursiyerin kayýt olacagi kurs sayisi = ");
						int kurs_say = scan.nextInt();
						scan.nextLine();
						for (int k = 0; k < kurs_say; k++) {

							System.out.println((k + 1) + ". kurs ID = ");
							int kurs_ID_ = scan.nextInt();
							scan.nextLine();
							System.out.println((k + 1) + ". kurs ad = ");
							String kurs_ad_ = scan.nextLine();
							kurslar.add(new Kurs(kurs_ID_, kurs_ad_));
						}
						Kursiyer.ekle(kursiyer, id, adSoyad_, yas, kurslar);

						System.out.println("\nMenuye donmek icin Enter'e basiniz. ");
						scan.nextLine();
						break;

					case 4:
						System.out.print("Aranacak kursiyerin adini ve soyadini arada bosluk olacak sekilde giriniz = ");
						String adSoyad;
						adSoyad = scan.nextLine();
						Kursiyer.arama(kursiyer, adSoyad);
						System.out.println("Menuye donmek icin enter'a basiniz.");
						scan.nextLine();
						break;

					case 5:
						System.out.print("\nSilinecek kursiyer ID : ");
						int id_ = scan.nextInt();
						kursiyer = Kursiyer.sil(kursiyer, id_);
						System.out.println("Menuye donmek icin Enter'e basiniz. ");
						scan.nextLine();
						break;

					case 6:
						System.out.println("\nTum Kursiyerler");
						System.out.println("------------------------");
						Kursiyer.listele(kursiyer);
						System.out.println("Menuye donmek icin enter'a basiniz.");
						scan.nextLine();
						break;

					case 7:
						Kursiyer.ayrintili_listele(kursiyer, kurs1);
						System.out.println("Menuye donmek icin enter'a basiniz.");
						scan.nextLine();
						break;

					case 8:
						int id_8;
						System.out.print("\nAylik ödemesi hesaplanacak kursiyer ID : ");
						id_8 = scan.nextInt();
						Kursiyer.hesaplama(kursiyer, id_8);
						System.out.println("Menuye donmek icin Enter'e basiniz. ");
						scan.nextLine();
						break;

					case 9:
						dongu = false;

					}
				}

			}
		}
		
		
		
		
		