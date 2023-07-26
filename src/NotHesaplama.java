public class NotHesaplama {

    public static void main(String[] args) {
        // Ders adları ve etkileme yüzdeleri için bir Map kullanalım
        Map<String, Double> etkilemeYuzdeleri = new HashMap<>();
        etkilemeYuzdeleri.put("Matematik", 0.25);
        etkilemeYuzdeleri.put("Fizik", 0.20);
        // Diğer derslerin etkileme yüzdelerini buraya ekleyebilirsiniz

        // Öğrencinin aldığı notlar
        Map<String, Integer> notlar = new HashMap<>();
        notlar.put("Matematik", 85);
        notlar.put("Fizik", 90);
        // Diğer derslerin notlarını buraya ekleyebilirsiniz

        double genelOrtalama = 0.0;

        for (String ders : etkilemeYuzdeleri.keySet()) {
            double sozluEtki = etkilemeYuzdeleri.get(ders);
            double sinavEtki = 1.0 - sozluEtki;

            int sozluNot = notlar.get(ders);
            int sinavNot = 100 - sozluNot; // Diyelim ki sınav notu sözlü notun tamamlayıcısı olsun

            double dersOrtalamasi = (sozluNot * sozluEtki) + (sinavNot * sinavEtki);
            genelOrtalama += dersOrtalamasi;

            System.out.println(ders + " Ortalaması: " + dersOrtalamasi);
        }

        genelOrtalama /= etkilemeYuzdeleri.size();
        System.out.println("Genel Ortalama: " + genelOrtalama);
    }
}
