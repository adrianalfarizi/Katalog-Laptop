package com.example.kataloglaptop;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
private static List<Laptop> laptops = new ArrayList<>();

private static List<Acer> initDataAcer(Context ctx) {
        List<Acer> acers = new ArrayList<>();
        acers.add(new Acer("Aspire-7-A715-75G-41G-FP-Black", "Processor Intel Core i5-9300H 4 x 2.4 - 4.1 GHz, Coffee Lake-H \n"+
                "Memory8192 MB DDR4-2666, Dual-Channel, two memory slots (both occupied)",
                R.drawable.acer_aspire_7));
        acers.add(new Acer("Porsche-Design-Acer-Book-RS_AP714-51", "Processor Intel® Core™ i7-1165G7 Processors \n"+
                "Dual-channel LPDDR4X SDRAM support:\n" +
                "8GB/16 GB of onboard LPDDR4X system memory",
                R.drawable.acer_book));
        acers.add(new Acer("Acer-Nitro-7_AN715-52_RGB-KB", "Processor Intel Comet Lake Core i7-10750H, 6C/12T \n"+
                "Memory 16 GB DDR4 RAM 2933 MHz (2x 16 GB DIMMs)",
                R.drawable.acer_nitro_7));
        acers.add(new Acer("Acer-Spin-1-SP111-34N", "Procesor Intel Pentium Silver N5000 116 , Intel Celeron N4000 83 \n"+
                "RAM up to 4GB",
                R.drawable.acer_spin_1));
        acers.add(new Acer("Swift_7_SF714-52T-Black-Budlight", "Processor Intel Core i7-8500Y 2 x 1.5 - 4.2 GHz (Intel Core i7) \n"+
                "Memory16384 MB , LPDDR3-1866, dual-channel, storage is soldered in, no storage slot",
                R.drawable.acer_swift_7));
        return acers;
}
        private static List<Asus> initDataAsus(Context ctx) {
                List<Asus> asuss = new ArrayList<>();
                asuss.add(new Asus("ExpertBook B9450FA", "Procesor Intel® Core™ i7-10510 processor\n" +
                        "1.8GHz quad-core with Turbo Boost (up to 4.9GHz) and 8MB cache\n"+
                        "Memory 8GB / 16GB 2133MHz LDDR3 onboard (dual channel support)",
                        R.drawable.asus_expertbook));
                asuss.add(new Asus("Asus ROG G752", "Procesor 2.6GHz Intel Core i7-6700HQ \n"+
                        "(quad-core, up to 3.5GHz with Turbo Boost) \n"+
                        "RAM: 16GB DDR4",
                        R.drawable.asus_rog));
                asuss.add(new Asus("ASUS TUF TUF505DU-KB71", "Procesor AMD® Ryzen 7-3750H \n"+
                        "RAM Up to 32GB ",
                        R.drawable.asus_tuf));
                asuss.add(new Asus("VivoBook 15", "Processor 10th Gen Intel Core i7 \n"+
                        "8GB of memory ",
                        R.drawable.asus_vivovbook));
                asuss.add(new Asus("ZenBook S UX391FA-XH74T", "Procesor Core i7 i7-8565U 1.80 GHz Quad-core (4 Core) \n"+
                        "16 GB RAM",
                        R.drawable.asus_zenbook));
                return asuss;
        }

        private static List<HP> initDataHP(Context ctx) {
                List<HP> HPs = new ArrayList<>();
                HPs.add(new HP("HP ENVY - 13-ah1038tx", "Intel® Core™ i5-8265U (1.6 GHz base frequency,\n"+
                        " up to 3.9 GHz with Intel® Turbo Boost Technology, 6 MB cache, 4 cores)\n"+
                        "8 GB LPDDR3-2133 SDRAM (onboard)",
                        R.drawable.hp_envy_img));
                HPs.add(new HP("HP Laptop - 15s-eq0132au", "AMD Ryzen™ 7 processor \n"+
                        "8 GB DDR4-2400 SDRAM (1 x 8 GB)",
                        R.drawable.hp_essentialhome));
                HPs.add(new HP("HP 15.6\" OMEN 15-dc2010nr", "2.6 GHz Intel Core i7-10750H Six-Core\n"+
                        "8GB DDR4 RAM | 512GB PCIe M.2 SSD",
                        R.drawable.hp_omen));
                HPs.add(new HP("HP Pavilion - 15-cs3067st", "Intel® Core™ i7-1065G7 (1.3 GHz base frequency,\n"+
                        " up to 3.9 GHz with Intel® Turbo Boost Technology, 8 MB cache, 4 cores)\n"+
                        "8 GB DDR4-2666 SDRAM (1 x 8 GB)",
                        R.drawable.hp_pavilion));
                HPs.add(new HP("HP Spectre x360 - 15-df0013dx", "Intel® Core™ i7-8565U (1.8 GHz base frequency,\n"+
                        " up to 4.6 GHz with Intel® Turbo Boost Technology, 8 MB cache, 4 cores)\n"+
                        "16 GB DDR4-2400 SDRAM (2 x 8 GB)",
                        R.drawable.hp_spectre));
                return HPs;
        }

private static void initAllLaptops(Context ctx) {
        laptops.addAll(initDataAcer(ctx));
        laptops.addAll(initDataAsus(ctx));
        laptops.addAll(initDataHP(ctx));

        }

public static List<Laptop> getAllLaptop(Context ctx) {
        if (laptops.size() == 0) {
        initAllLaptops(ctx);
        }
        return laptops;
        }

public static List<Laptop> getLaptopsbytipe(Context ctx, String type) {
        List<Laptop> laptopsByType = new ArrayList<>();
        if (laptops.size() == 0) {
        initAllLaptops(ctx);
        }
        for (Laptop h : laptops) {
        if (h.getMerk().equals(type)) {
        laptopsByType.add(h);
        }
        }
        return laptopsByType;
        }

}
