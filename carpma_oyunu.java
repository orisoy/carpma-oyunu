import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class carpma_oyunu {
    public static int rastgelesayı() {
        int[] dizi = {
            1,   2,   3,   4,   5,   6,   7,   8,   9,   10,
            2,   4,   6,   8,   10,  12,  14,  16,  18,  20,
            3,   6,   9,   12,  15,  18,  21,  24,  27,  30,
            4,   8,   12,  16,  20,  24,  28,  32,  36,  40,
            5,   10,  15,  20,  25,  30,  35,  40,  45,  50,
            6,   12,  18,  24,  30,  36,  42,  48,  54,  60,
            7,   14,  21,  28,  35,  42,  49,  56,  63,  70,
            8,   16,  24,  32,  40,  48,  56,  64,  72,  80,
            9,   18,  27,  36,  45,  54,  63,  72,  81,  90,
            10,  20,  30,  40,  50,  60,  70,  80,  90,  100
        };
        Random rastgele = new Random();
        int index = rastgele.nextInt(dizi.length);
        int sonuc = dizi[index];
        return sonuc;
    

    }
    public static void main(String[] args) {
        
            JFrame pencere = new JFrame();
            pencere.setSize(600, 500);
            pencere.setTitle("Çarpma Oyunu");

            JLabel rastgelesayı = new JLabel();
            int rsayı = rastgelesayı();
            rastgelesayı.setText(String.valueOf(rsayı));
            
            rastgelesayı.setPreferredSize(null);
            rastgelesayı.setBounds(285, 60, 100, 40);
            pencere.add(rastgelesayı);

            JLabel numa = new JLabel();
            numa.setText("sayı1");
            numa.setBounds(150, 100, 50, 30);
            pencere.add(numa);
            JLabel numb = new JLabel();
            numb.setText("sayı2");
            numb.setBounds(405, 100, 50, 30);
            pencere.add(numb);
            JLabel carpı = new JLabel();
            carpı.setText("x");
            carpı.setBounds(290, 145, 20, 20);
            pencere.add(carpı);
            JLabel asayı = new JLabel();
            asayı.setText("girilmedi");
            asayı.setBounds(150, 140, 50, 30);
            pencere.add(asayı);
            JLabel bsayı = new JLabel();
            bsayı.setText("girilmedi");
            bsayı.setBounds(405, 140, 50, 30);
            pencere.add(bsayı);
            
            JLabel imza = new JLabel();
            imza.setText("Onur TURAN");
            imza.setBounds(400, 400, 100, 40);
            pencere.add(imza);

            final int[] aasayı = {1};
            final int[] bbsayı = {1};

            int ax = 45;
            int ay = 45;
            int ae = 55; 
            int ab = 30; 
            int ayfark = 40; 

            JButton abir = new JButton("1");
            abir.setBounds(ax, ay, ae, ab);
            abir.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    asayı.setText("1");
                    aasayı[0] = 1;
                        }
            });
            pencere.add(abir);

            ay+= ayfark;
            JButton aiki = new JButton("2");
            aiki.setBounds(ax, ay, ae, ab);
            aiki.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    asayı.setText("2");
                    aasayı[0] = 2;
                        }
            });
            pencere.add(aiki);

            ay+= ayfark;
            JButton aüç = new JButton("3");
            aüç.setBounds(ax, ay, ae, ab);
            aüç.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    asayı.setText("3");
                    aasayı[0] = 3;
                        }
            });
            pencere.add(aüç);

            ay+= ayfark;
            JButton adört = new JButton("4");
            adört.setBounds(ax, ay, ae, ab);
            adört.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    asayı.setText("4");
                    aasayı[0] = 4;
                        }
            });
            pencere.add(adört);

            ay+= ayfark;
            JButton abeş = new JButton("5");
            abeş.setBounds(ax, ay, ae, ab);
            abeş.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    asayı.setText("5");
                    aasayı[0] = 5;
                        }
            });
            pencere.add(abeş);

            ay+= ayfark;
            JButton aaltı = new JButton("6");
            aaltı.setBounds(ax, ay, ae, ab);
            aaltı.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    asayı.setText("6");
                    aasayı[0] = 6;
                        }
            });
            pencere.add(aaltı);

            ay+= ayfark;
            JButton ayedi = new JButton("7");
            ayedi.setBounds(ax, ay, ae, ab);
            ayedi.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    asayı.setText("7");
                    aasayı[0] = 7;
                        }
            });
            pencere.add(ayedi);

            ay+= ayfark;
            JButton asekkiz = new JButton("8");
            asekkiz.setBounds(ax, ay, ae, ab);
            asekkiz.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    asayı.setText("8");
                    aasayı[0] = 8;
                        }
            });
            pencere.add(asekkiz);

            ay+= ayfark;
            JButton adokuz = new JButton("9");
            adokuz.setBounds(ax, ay, ae, ab);
            adokuz.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    asayı.setText("9");
                    aasayı[0] = 9;
                        }
            });
            pencere.add(adokuz);

            ay+= ayfark;
            JButton aon = new JButton("10");
            aon.setBounds(ax, ay, ae, ab);
            aon.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    asayı.setText("10");
                    aasayı[0] = 10;
                        }
            });
            pencere.add(aon);


            int bx = 485; 
            int by = 45; 
            int be = 55; 
            int bb = 30; 
            int byfark = 40; 

            JButton bbir = new JButton("1");
            bbir.setBounds(bx, by, be, bb);
            bbir.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    bsayı.setText("1");
                    bbsayı[0] = 1;
                        }
            });
            pencere.add(bbir);

            by += byfark;
            JButton biki = new JButton("2");
            biki.setBounds(bx, by, be, bb);
            biki.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    bsayı.setText("2");
                    bbsayı[0] = 2;
                        }
            });
            pencere.add(biki);

            by += byfark;
            JButton büç = new JButton("3");
            büç.setBounds(bx, by, be, bb);
            büç.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    bsayı.setText("3");
                    bbsayı[0] = 3;
                        }
            });
            pencere.add(büç);

            by += byfark;
            JButton bdört = new JButton("4");
            bdört.setBounds(bx, by, be, bb);
            bdört.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    bsayı.setText("4");
                    bbsayı[0] = 4;
                        }
            });
            pencere.add(bdört);

            by += byfark;
            JButton beş = new JButton("5");
            beş.setBounds(bx, by, be, bb);
            beş.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    bsayı.setText("5");
                    bbsayı[0] = 5;
                        }
            });
            pencere.add(beş);

            by += byfark;
            JButton baltı = new JButton("6");
            baltı.setBounds(bx, by, be, bb);
            baltı.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    bsayı.setText("6");
                    bbsayı[0] = 6;
                        }
            });
            pencere.add(baltı);

            by += byfark;
            JButton byedi = new JButton("7");
            byedi.setBounds(bx, by, be, bb);
            byedi.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    bsayı.setText("7");
                    bbsayı[0] = 7;
                        }
            });
            pencere.add(byedi);

            by += byfark;
            JButton bsekiz = new JButton("8");
            bsekiz.setBounds(bx, by, be, bb);
            bsekiz.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    bsayı.setText("8");
                    bbsayı[0] = 8;
                        }
            });
            pencere.add(bsekiz);

            by += byfark;
            JButton bdokuz = new JButton("9");
            bdokuz.setBounds(bx, by, be, bb);
            bdokuz.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    bsayı.setText("9");
                    bbsayı[0] = 9;
                        }
            });
            pencere.add(bdokuz);

            by += byfark;
            JButton bon = new JButton("10");
            bon.setBounds(bx, by, be, bb);
            bon.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    bsayı.setText("10");
                    bbsayı[0] = 10;
                        }
            });
            pencere.add(bon);

            JButton pas = new JButton();
            pas.setText("sayıyı karıştır");
            pas.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int rsayı = rastgelesayı();
                    rastgelesayı.setText(String.valueOf(rsayı));
                }});
            pas.setBounds(237, 30, 110,30);
            pencere.add(pas);

            JButton sonucbutonu = new JButton();
            sonucbutonu.setText("sonuçlandır");
            sonucbutonu.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                
                    if (Integer.parseInt(rastgelesayı.getText()) == aasayı[0]*bbsayı[0]) {
                        sonucbutonu.setText("doğru!!");
                    }
                    else {
                        sonucbutonu.setText("yanlış!!");
                    }
                }});
            sonucbutonu.setBounds(250, 250, 100,50);
            pencere.add(sonucbutonu);

            pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            pencere.setLayout(null);
            pencere.setLocationRelativeTo(null);
            pencere.setVisible(true);
    }
}




