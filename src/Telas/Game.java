/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Classes.Sound;
import static Classes.Sound.nromusic;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Shut
 */
public class Game extends javax.swing.JFrame {

    Random rand = new Random();
    
    //Nros label
    int lbnro;
    String imagens[] = new String[16];
    
    //Label nomes
    JLabel lbl[] = new JLabel[16];
    int y;
    int x;
    
    //Clicar na imagem
    int clicks = 0;
    String nro1;
    String nro2;
    
    JLabel label1;
    JLabel label2;
    
    //Status do jogo
    String status = "naoiniciado";
    
   
    
    public Game() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ant = new javax.swing.JLabel();
        prox = new javax.swing.JLabel();
        play = new javax.swing.JLabel();
        player = new javax.swing.JLabel();
        linha = new javax.swing.JLabel();
        inic = new javax.swing.JLabel();
        sort = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        img1 = new javax.swing.JLabel();
        img2 = new javax.swing.JLabel();
        img3 = new javax.swing.JLabel();
        img4 = new javax.swing.JLabel();
        img5 = new javax.swing.JLabel();
        img6 = new javax.swing.JLabel();
        img7 = new javax.swing.JLabel();
        img8 = new javax.swing.JLabel();
        img9 = new javax.swing.JLabel();
        img10 = new javax.swing.JLabel();
        img11 = new javax.swing.JLabel();
        img12 = new javax.swing.JLabel();
        img13 = new javax.swing.JLabel();
        img14 = new javax.swing.JLabel();
        img15 = new javax.swing.JLabel();
        img16 = new javax.swing.JLabel();
        logo2 = new javax.swing.JLabel();
        wallpaper = new javax.swing.JLabel();
        logo3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ant.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        ant.setForeground(new java.awt.Color(255, 125, 37));
        ant.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                antMouseClicked(evt);
            }
        });
        getContentPane().add(ant, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 420, 40, 40));

        prox.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        prox.setForeground(new java.awt.Color(255, 125, 37));
        prox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                proxMouseClicked(evt);
            }
        });
        getContentPane().add(prox, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 420, 40, 40));

        play.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        play.setForeground(new java.awt.Color(255, 125, 37));
        play.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        play.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playMouseClicked(evt);
            }
        });
        getContentPane().add(play, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 410, 60, 60));

        player.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        player.setForeground(new java.awt.Color(255, 125, 37));
        player.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        player.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(player, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 370, 360, 30));

        linha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 125, 37), 15));
        getContentPane().add(linha, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, 240, 10));

        inic.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        inic.setForeground(new java.awt.Color(255, 125, 37));
        inic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inic.setText("Iniciar");
        inic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 125, 37), 2));
        inic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inicMouseClicked(evt);
            }
        });
        getContentPane().add(inic, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 560, 300, 60));

        sort.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        sort.setForeground(new java.awt.Color(255, 125, 37));
        sort.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sort.setText("Sortear");
        sort.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 125, 37), 2));
        sort.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sort.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sortMouseClicked(evt);
            }
        });
        getContentPane().add(sort, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 490, 300, 60));

        exit.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 125, 37));
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("X");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 10, 40, -1));
        getContentPane().add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 190, 230, 180));

        logo.setFont(new java.awt.Font("Footlight MT Light", 0, 48)); // NOI18N
        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 340, 130));

        img1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 125, 37), 2));
        img1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img1MouseClicked(evt);
            }
        });
        getContentPane().add(img1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 140, 140));

        img2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 125, 37), 2));
        img2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img2MouseClicked(evt);
            }
        });
        getContentPane().add(img2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 140, 140));

        img3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 125, 37), 2));
        img3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img3MouseClicked(evt);
            }
        });
        getContentPane().add(img3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 140, 140));

        img4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 125, 37), 2));
        img4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img4MouseClicked(evt);
            }
        });
        getContentPane().add(img4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 140, 140));

        img5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 125, 37), 2));
        img5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img5MouseClicked(evt);
            }
        });
        getContentPane().add(img5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 140, 140));

        img6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 125, 37), 2));
        img6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img6MouseClicked(evt);
            }
        });
        getContentPane().add(img6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 140, 140));

        img7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 125, 37), 2));
        img7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img7MouseClicked(evt);
            }
        });
        getContentPane().add(img7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 140, 140));

        img8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 125, 37), 2));
        img8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img8MouseClicked(evt);
            }
        });
        getContentPane().add(img8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 140, 140));

        img9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 125, 37), 2));
        img9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img9MouseClicked(evt);
            }
        });
        getContentPane().add(img9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 140, 140));

        img10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 125, 37), 2));
        img10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img10MouseClicked(evt);
            }
        });
        getContentPane().add(img10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 140, 140));

        img11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 125, 37), 2));
        img11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img11MouseClicked(evt);
            }
        });
        getContentPane().add(img11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 140, 140));

        img12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 125, 37), 2));
        img12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img12MouseClicked(evt);
            }
        });
        getContentPane().add(img12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 140, 140));

        img13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 125, 37), 2));
        img13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img13MouseClicked(evt);
            }
        });
        getContentPane().add(img13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 140, 140));

        img14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 125, 37), 2));
        img14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img14MouseClicked(evt);
            }
        });
        getContentPane().add(img14, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 140, 140));

        img15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 125, 37), 2));
        img15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img15MouseClicked(evt);
            }
        });
        getContentPane().add(img15, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, 140, 140));

        img16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 125, 37), 2));
        img16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img16MouseClicked(evt);
            }
        });
        getContentPane().add(img16, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, 140, 140));

        logo2.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        logo2.setForeground(new java.awt.Color(255, 125, 37));
        logo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo2.setText("<html><center>MEMORY<br>GAME</center></html>");
        logo2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(logo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 170, 90, 30));

        wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game icon/wallpaper.jpg"))); // NOI18N
        wallpaper.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                wallpaperKeyPressed(evt);
            }
        });
        getContentPane().add(wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 630));

        logo3.setFont(new java.awt.Font("Arial", 2, 60)); // NOI18N
        logo3.setForeground(new java.awt.Color(255, 125, 37));
        logo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo3.setText("<html><center>MEMORY<br>GAME</center></html>");
        getContentPane().add(logo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, 350, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        labels();  
        musica();
        
        //Imagem dos logos
        ImageIcon wallp = new ImageIcon(new ImageIcon("build/classes/game icon/logo.png").getImage().getScaledInstance(350, 130, Image.SCALE_DEFAULT));
        logo.setIcon(wallp);
        
        ImageIcon iconw = new ImageIcon(new ImageIcon("build/classes/game icon/iconnn.png").getImage().getScaledInstance(230, 180, Image.SCALE_DEFAULT));
        icon.setIcon(iconw);
        
        //PLayer imgs
        ImageIcon playicon = new ImageIcon(new ImageIcon("build/classes/game icon/pausa.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT));
        play.setIcon(playicon);
        
        ImageIcon proxicon = new ImageIcon(new ImageIcon("build/classes/game icon/proximo.png").getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
        prox.setIcon(proxicon);
        
        ImageIcon anticon = new ImageIcon(new ImageIcon("build/classes/game icon/anterior.png").getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
        ant.setIcon(anticon);
        
        
  
    }//GEN-LAST:event_formWindowOpened
    private void musica(){
        Classes.Sound.nromusic = rand.nextInt(2);

        if(Classes.Sound.nromusic == 0){
     
            Classes.Sound.nome = "Travelers";
            player.setText(Classes.Sound.nome);
            
            Classes.Sound.fund0.play();
         
        }
     
        if(Classes.Sound.nromusic == 1){
     
            Classes.Sound.nome = "14.3 Billion Years";
            player.setText(Classes.Sound.nome);
            
            Classes.Sound.fund1.play();
         
        }
    }
    
    private void playmusic(){
        
        if(Classes.Sound.statusmusica.equals("pause")){
            
            if(Classes.Sound.nromusic == 0){

                Classes.Sound.fund0.play();
                
                ImageIcon playicon = new ImageIcon(new ImageIcon("build/classes/game icon/pausa.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT));
                play.setIcon(playicon);
                
                Classes.Sound.statusmusica = "tocando";

            }

            if(Classes.Sound.nromusic == 1){

                Classes.Sound.fund1.play();
                
                ImageIcon playicon = new ImageIcon(new ImageIcon("build/classes/game icon/pausa.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT));
                play.setIcon(playicon);
                
                Classes.Sound.statusmusica = "tocando";

            }
        }
        else if(Classes.Sound.statusmusica.equals("tocando")){
            
            if(Classes.Sound.nromusic == 0){

                Classes.Sound.fund0.stop();
                
                ImageIcon playicon = new ImageIcon(new ImageIcon("build/classes/game icon/play.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT));
                play.setIcon(playicon);
                
                Classes.Sound.statusmusica = "pause";

            }

            if(Classes.Sound.nromusic == 1){

                Classes.Sound.fund1.stop();
                
                ImageIcon playicon = new ImageIcon(new ImageIcon("build/classes/game icon/play.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT));
                play.setIcon(playicon);
                
                Classes.Sound.statusmusica = "pause";

            }
        }
    }
    
    private void proximamusica(){
        
        if(Classes.Sound.nromusic == 0){
                
            Classes.Sound.fund0.stop();
            Classes.Sound.fund1.play();
            
            Classes.Sound.nome = "14.3 Billion Years";
            player.setText(Classes.Sound.nome);
            
            Classes.Sound.nromusic = 1;
         
        }
     
        else if(Classes.Sound.nromusic == 1){

            Classes.Sound.fund1.stop();
            Classes.Sound.fund0.play();
            
            Classes.Sound.nome = "Travelers";
            player.setText(Classes.Sound.nome);
            
            Classes.Sound.nromusic = 0;
            
        }    
    }
    
    private void labels(){
                 
        lbl[0] = img1;lbl[1] = img2;lbl[2] = img3;lbl[3] = img4;lbl[4] = img5;lbl[5] = img6;lbl[6] = img7;lbl[7] = img8;lbl[8] = img9;lbl[9] = img10;lbl[10] = img11;lbl[11] = img12;
        lbl[12] = img13;lbl[13] = img14;lbl[14] = img15;lbl[15] = img16;

    }

    private void carregaFotos()
    {
        Random ran = new Random();
                       
        for (x = 0; x < 16; x++)
        {
            lbl[x].setVisible(true);
        }
        
        for (x = 0; x < 8; x++)
        {          
            if (!imagens[x].equals(" "))
            {
                ImageIcon imgPhoto = new ImageIcon(new ImageIcon("build/classes/iconesmemoria/" + imagens[x]).getImage().getScaledInstance(140, 140, Image.SCALE_DEFAULT));
                
                for (y = 0; y < 200; y++)
                {
                    lbnro = ran.nextInt(16);
                    if (lbl[lbnro].getIcon() == null)
                    {
                        lbl[lbnro].setIcon(imgPhoto);
                        lbl[lbnro].setText(String.valueOf(x));
                        y=999;
                    }                  
                }
                for (y = 0; y < 200; y++)
                {
                    lbnro = ran.nextInt(16);
                    if (lbl[lbnro].getIcon() == null)
                    {
                        lbl[lbnro].setIcon(imgPhoto);
                        lbl[lbnro].setText(String.valueOf(x));
                        y=999;
                    }                  
                }
            }
        }
    }

    private void wallpaperKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wallpaperKeyPressed
             
    }//GEN-LAST:event_wallpaperKeyPressed
    private void carregaArquivos()
    {
       
        for (x = 0; x < 16; x++)
        {
            imagens[x] = " ";
        }
        
        x = 0;
                
        File raiz = new File("build/classes/iconesmemoria/");
	
        for(File f: raiz.listFiles()) 
        {
            if(f.isFile()) 
            {
                imagens[x] = f.getName();
                x++;
            }
        }
    }

    private void esconde(){
    
        for(int v = 0; v<16; v++){
            ImageIcon virar = new ImageIcon(new ImageIcon("build/classes/game icon/tras.jpg").getImage().getScaledInstance(140, 140, Image.SCALE_DEFAULT));
            
            lbl[v].setIcon(virar);
        }
    }
    
    private void comparar(){
    
        if(nro1.equals(nro2))
        {
        
            JOptionPane.showMessageDialog(null, "Voce acertou, Parabéns!");
            label1.setIcon(null);
            label2.setIcon(null);
            
            label1 = null;
            label2 = null;   
            
            finalizar();
        }
        else
        {
            
            JOptionPane.showMessageDialog(null, "Você errou, burro!"); 
            
            ImageIcon virar = new ImageIcon(new ImageIcon("build/classes/game icon/tras.jpg").getImage().getScaledInstance(140, 140, Image.SCALE_DEFAULT));
            label1.setIcon(virar);
            label2.setIcon(virar);
            
            label1 = null;
            label2 = null;
        }
        
    }
    
    private void statusdojogo(){
    
        if(status.equals("naoiniciado")){
        
            JOptionPane.showMessageDialog(null, "Clique em 'Sortear' e depois em 'Iniciar' para jogar"); 
        
        }
        else if(status.equals("sorteado")){
        
            JOptionPane.showMessageDialog(null, "Clique em 'Iniciar' para jogar");            
        
        }
    
    }
    
    private void finalizar(){
        int imgs = 0;
        for(int v = 0; v < 16; v++){
        
            if(lbl[v].getIcon() == null){              
                imgs++;    
                
                if(imgs == 16){
                    
                   JOptionPane.showMessageDialog(null, "Você terminou  O JOGO, Parabéns!!!!"); 
                   sort.setEnabled(true);
                   inic.setEnabled(true);

                }
            }     
        }
    }
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

    }//GEN-LAST:event_formKeyPressed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        dispose();
        Sound.fund0.stop();
        Sound.fund1.stop();
    }//GEN-LAST:event_exitMouseClicked

    private void sortMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sortMouseClicked
        status = "sorteado";
        labels();
        carregaArquivos();
        carregaFotos();
        
        sort.setEnabled(false);
    }//GEN-LAST:event_sortMouseClicked

    private void inicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicMouseClicked
        status = "iniciado";
        esconde();     
        
        inic.setEnabled(false);
    }//GEN-LAST:event_inicMouseClicked

    private void img1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img1MouseClicked
        statusdojogo();
        if(status.equals("iniciado")){
            if(clicks == 0)
            {
                label1 = img1;
                
                nro1 = img1.getText();
                
                ImageIcon imgPhoto = new ImageIcon(new ImageIcon("build/classes/iconesmemoria/" + imagens[Integer.parseInt(nro1)]).getImage().getScaledInstance(140, 140, Image.SCALE_DEFAULT));
                img1.setIcon(imgPhoto);
                
                clicks++;
            }
            else
            {
                label2 = img1;   

                nro2 = img1.getText();
                
                ImageIcon imgPhoto = new ImageIcon(new ImageIcon("build/classes/iconesmemoria/" + imagens[Integer.parseInt(nro2)]).getImage().getScaledInstance(140, 140, Image.SCALE_DEFAULT));
                img1.setIcon(imgPhoto);
                
                comparar();
                clicks = 0;
            }
        }
    }//GEN-LAST:event_img1MouseClicked

    private void img2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img2MouseClicked
        statusdojogo();
        if(status.equals("iniciado")){
            if(clicks == 0)
            {
                label1 = img2;
                
                nro1 = img2.getText();
                
                ImageIcon imgPhoto = new ImageIcon(new ImageIcon("build/classes/iconesmemoria/" + imagens[Integer.parseInt(nro1)]).getImage().getScaledInstance(140, 140, Image.SCALE_DEFAULT));
                img2.setIcon(imgPhoto);
                
                clicks++;
            }
            else
            {
                label2 = img2;
                
                nro2 = img2.getText();
                
                ImageIcon imgPhoto = new ImageIcon(new ImageIcon("build/classes/iconesmemoria/" + imagens[Integer.parseInt(nro2)]).getImage().getScaledInstance(140, 140, Image.SCALE_DEFAULT));
                img2.setIcon(imgPhoto);
                
                comparar();
                clicks = 0;
            }
        }
    }//GEN-LAST:event_img2MouseClicked

    private void img3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img3MouseClicked
        statusdojogo();
        if(status.equals("iniciado")){
            if(clicks == 0)
            {
                label1 = img3;

                nro1 = img3.getText();
                
                ImageIcon imgPhoto = new ImageIcon(new ImageIcon("build/classes/iconesmemoria/" + imagens[Integer.parseInt(nro1)]).getImage().getScaledInstance(140, 140, Image.SCALE_DEFAULT));
                img3.setIcon(imgPhoto);
                
                clicks++;
            }
            else
            {
                label2 = img3;

                nro2 = img3.getText();
                
                ImageIcon imgPhoto = new ImageIcon(new ImageIcon("build/classes/iconesmemoria/" + imagens[Integer.parseInt(nro2)]).getImage().getScaledInstance(140, 140, Image.SCALE_DEFAULT));
                img3.setIcon(imgPhoto);
                
                comparar();
                clicks = 0;
            }
        }
    }//GEN-LAST:event_img3MouseClicked

    private void img4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img4MouseClicked
        statusdojogo();
        if(status.equals("iniciado")){
            if(clicks == 0)
            {
                label1 = img4;

                nro1 = img4.getText();
                
                ImageIcon imgPhoto = new ImageIcon(new ImageIcon("build/classes/iconesmemoria/" + imagens[Integer.parseInt(nro1)]).getImage().getScaledInstance(140, 140, Image.SCALE_DEFAULT));
                img4.setIcon(imgPhoto);
                
                clicks++;
            }
            else
            {
                label2 = img4;

                nro2 = img4.getText();
                
                ImageIcon imgPhoto = new ImageIcon(new ImageIcon("build/classes/iconesmemoria/" + imagens[Integer.parseInt(nro2)]).getImage().getScaledInstance(140, 140, Image.SCALE_DEFAULT));
                img4.setIcon(imgPhoto);
                
                comparar();
                clicks = 0;
            }
        }
    }//GEN-LAST:event_img4MouseClicked

    private void img5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img5MouseClicked
        statusdojogo();
        if(status.equals("iniciado")){
            if(clicks == 0)
            {
                label1 = img5;

                nro1 = img5.getText();
                
                ImageIcon imgPhoto = new ImageIcon(new ImageIcon("build/classes/iconesmemoria/" + imagens[Integer.parseInt(nro1)]).getImage().getScaledInstance(140, 140, Image.SCALE_DEFAULT));
                img5.setIcon(imgPhoto);
                
                clicks++;
            }
            else
            {
                label2 = img5;

                nro2 = img5.getText();
                
                ImageIcon imgPhoto = new ImageIcon(new ImageIcon("build/classes/iconesmemoria/" + imagens[Integer.parseInt(nro2)]).getImage().getScaledInstance(140, 140, Image.SCALE_DEFAULT));
                img5.setIcon(imgPhoto);
                
                comparar();
                clicks = 0;
            }
        }
    }//GEN-LAST:event_img5MouseClicked

    private void img6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img6MouseClicked
        statusdojogo();
        if(status.equals("iniciado")){
            if(clicks == 0)
            {
                label1 = img6;

                nro1 = img6.getText();
                
                ImageIcon imgPhoto = new ImageIcon(new ImageIcon("build/classes/iconesmemoria/" + imagens[Integer.parseInt(nro1)]).getImage().getScaledInstance(140, 140, Image.SCALE_DEFAULT));
                img6.setIcon(imgPhoto);
                
                clicks++;
            }
            else
            {
                label2 = img6;

                nro2 = img6.getText();
                
                ImageIcon imgPhoto = new ImageIcon(new ImageIcon("build/classes/iconesmemoria/" + imagens[Integer.parseInt(nro2)]).getImage().getScaledInstance(140, 140, Image.SCALE_DEFAULT));
                img6.setIcon(imgPhoto);
                
                comparar();
                clicks = 0;
            }
        }
    }//GEN-LAST:event_img6MouseClicked

    private void img7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img7MouseClicked
        statusdojogo();
        if(status.equals("iniciado")){
            if(clicks == 0)
            {
                label1 = img7;

                nro1 = img7.getText();
                
                ImageIcon imgPhoto = new ImageIcon(new ImageIcon("build/classes/iconesmemoria/" + imagens[Integer.parseInt(nro1)]).getImage().getScaledInstance(140, 140, Image.SCALE_DEFAULT));
                img7.setIcon(imgPhoto);                
                
                clicks++;
            }
            else
            {
                label2 = img7;

                nro2 = img7.getText();
                
                ImageIcon imgPhoto = new ImageIcon(new ImageIcon("build/classes/iconesmemoria/" + imagens[Integer.parseInt(nro2)]).getImage().getScaledInstance(140, 140, Image.SCALE_DEFAULT));
                img7.setIcon(imgPhoto);
                
                comparar();
                clicks = 0;
            }
        }
    }//GEN-LAST:event_img7MouseClicked

    private void img8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img8MouseClicked
        statusdojogo();
        if(status.equals("iniciado")){
            if(clicks == 0)
            {
                label1 = img8;

                nro1 = img8.getText();
                
                ImageIcon imgPhoto = new ImageIcon(new ImageIcon("build/classes/iconesmemoria/" + imagens[Integer.parseInt(nro1)]).getImage().getScaledInstance(140, 140, Image.SCALE_DEFAULT));
                img8.setIcon(imgPhoto);
                
                clicks++;
            }
            else
            {
                label2 = img8;

                nro2 = img8.getText();
                
                ImageIcon imgPhoto = new ImageIcon(new ImageIcon("build/classes/iconesmemoria/" + imagens[Integer.parseInt(nro2)]).getImage().getScaledInstance(140, 140, Image.SCALE_DEFAULT));
                img8.setIcon(imgPhoto);
                
                comparar();
                clicks = 0;
            }
        }
    }//GEN-LAST:event_img8MouseClicked

    private void img11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img11MouseClicked
        statusdojogo();
        if(status.equals("iniciado")){
            if(clicks == 0)
            {
                label1 = img11;
                
                nro1 = img11.getText();
                
                ImageIcon imgPhoto = new ImageIcon(new ImageIcon("build/classes/iconesmemoria/" + imagens[Integer.parseInt(nro1)]).getImage().getScaledInstance(140, 140, Image.SCALE_DEFAULT));
                img11.setIcon(imgPhoto);
                
                clicks++;
            }
            else
            {
                label2 = img11;   

                nro2 = img11.getText();
                
                ImageIcon imgPhoto = new ImageIcon(new ImageIcon("build/classes/iconesmemoria/" + imagens[Integer.parseInt(nro2)]).getImage().getScaledInstance(140, 140, Image.SCALE_DEFAULT));
                img11.setIcon(imgPhoto);
                
                comparar();
                clicks = 0;
            }
        }
    }//GEN-LAST:event_img11MouseClicked

    private void img9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img9MouseClicked
        statusdojogo();
        if(status.equals("iniciado")){
            if(clicks == 0)
            {
                label1 = img9;
                
                nro1 = img9.getText();
                
                ImageIcon imgPhoto = new ImageIcon(new ImageIcon("build/classes/iconesmemoria/" + imagens[Integer.parseInt(nro1)]).getImage().getScaledInstance(140, 140, Image.SCALE_DEFAULT));
                img9.setIcon(imgPhoto);
                
                clicks++;
            }
            else
            {
                label2 = img9;   

                nro2 = img9.getText();
                
                ImageIcon imgPhoto = new ImageIcon(new ImageIcon("build/classes/iconesmemoria/" + imagens[Integer.parseInt(nro2)]).getImage().getScaledInstance(140, 140, Image.SCALE_DEFAULT));
                img9.setIcon(imgPhoto);
                
                comparar();
                clicks = 0;
            }
        }
    }//GEN-LAST:event_img9MouseClicked

    private void img10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img10MouseClicked
        statusdojogo();
        if(status.equals("iniciado")){
            if(clicks == 0)
            {
                label1 = img10;
                
                nro1 = img10.getText();
                
                ImageIcon imgPhoto = new ImageIcon(new ImageIcon("build/classes/iconesmemoria/" + imagens[Integer.parseInt(nro1)]).getImage().getScaledInstance(140, 140, Image.SCALE_DEFAULT));
                img10.setIcon(imgPhoto);
                
                clicks++;
            }
            else
            {
                label2 = img10;   

                nro2 = img10.getText();
                
                ImageIcon imgPhoto = new ImageIcon(new ImageIcon("build/classes/iconesmemoria/" + imagens[Integer.parseInt(nro2)]).getImage().getScaledInstance(140, 140, Image.SCALE_DEFAULT));
                img10.setIcon(imgPhoto);
                
                comparar();
                clicks = 0;
            }
        }
    }//GEN-LAST:event_img10MouseClicked

    private void img12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img12MouseClicked
        statusdojogo();
        if(status.equals("iniciado")){
            if(clicks == 0)
            {
                label1 = img12;
                
                nro1 = img12.getText();
                
                ImageIcon imgPhoto = new ImageIcon(new ImageIcon("build/classes/iconesmemoria/" + imagens[Integer.parseInt(nro1)]).getImage().getScaledInstance(140, 140, Image.SCALE_DEFAULT));
                img12.setIcon(imgPhoto);
                
                clicks++;
            }
            else
            {
                label2 = img12;   

                nro2 = img12.getText();
                
                ImageIcon imgPhoto = new ImageIcon(new ImageIcon("build/classes/iconesmemoria/" + imagens[Integer.parseInt(nro2)]).getImage().getScaledInstance(140, 140, Image.SCALE_DEFAULT));
                img12.setIcon(imgPhoto);
                
                comparar();
                clicks = 0;
            }
        }
    }//GEN-LAST:event_img12MouseClicked

    private void img13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img13MouseClicked
        statusdojogo();
        if(status.equals("iniciado")){
            if(clicks == 0)
            {
                label1 = img13;
                
                nro1 = img13.getText();
                
                ImageIcon imgPhoto = new ImageIcon(new ImageIcon("build/classes/iconesmemoria/" + imagens[Integer.parseInt(nro1)]).getImage().getScaledInstance(140, 140, Image.SCALE_DEFAULT));
                img13.setIcon(imgPhoto);
                
                clicks++;
            }
            else
            {
                label2 = img13;   

                nro2 = img13.getText();
                
                ImageIcon imgPhoto = new ImageIcon(new ImageIcon("build/classes/iconesmemoria/" + imagens[Integer.parseInt(nro2)]).getImage().getScaledInstance(140, 140, Image.SCALE_DEFAULT));
                img13.setIcon(imgPhoto);
                
                comparar();
                clicks = 0;
            }
        }
    }//GEN-LAST:event_img13MouseClicked

    private void img14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img14MouseClicked
        statusdojogo();
        if(status.equals("iniciado")){
            if(clicks == 0)
            {
                label1 = img14;
                
                nro1 = img14.getText();
                
                ImageIcon imgPhoto = new ImageIcon(new ImageIcon("build/classes/iconesmemoria/" + imagens[Integer.parseInt(nro1)]).getImage().getScaledInstance(140, 140, Image.SCALE_DEFAULT));
                img14.setIcon(imgPhoto);
                
                clicks++;
            }
            else
            {
                label2 = img14;   

                nro2 = img14.getText();
                
                ImageIcon imgPhoto = new ImageIcon(new ImageIcon("build/classes/iconesmemoria/" + imagens[Integer.parseInt(nro2)]).getImage().getScaledInstance(140, 140, Image.SCALE_DEFAULT));
                img14.setIcon(imgPhoto);
                
                comparar();
                clicks = 0;
            }
        }
    }//GEN-LAST:event_img14MouseClicked

    private void img15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img15MouseClicked
        statusdojogo();
        if(status.equals("iniciado")){
            if(clicks == 0)
            {
                label1 = img15;
                
                nro1 = img15.getText();
                
                ImageIcon imgPhoto = new ImageIcon(new ImageIcon("build/classes/iconesmemoria/" + imagens[Integer.parseInt(nro1)]).getImage().getScaledInstance(140, 140, Image.SCALE_DEFAULT));
                img15.setIcon(imgPhoto);
                
                clicks++;
            }
            else
            {
                label2 = img15;   

                nro2 = img15.getText();
                
                ImageIcon imgPhoto = new ImageIcon(new ImageIcon("build/classes/iconesmemoria/" + imagens[Integer.parseInt(nro2)]).getImage().getScaledInstance(140, 140, Image.SCALE_DEFAULT));
                img15.setIcon(imgPhoto);
                
                comparar();
                clicks = 0;
            }
        }
    }//GEN-LAST:event_img15MouseClicked

    private void img16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img16MouseClicked
        statusdojogo();
        if(status.equals("iniciado")){
            if(clicks == 0)
            {
                label1 = img16;
                
                nro1 = img16.getText();
                
                ImageIcon imgPhoto = new ImageIcon(new ImageIcon("build/classes/iconesmemoria/" + imagens[Integer.parseInt(nro1)]).getImage().getScaledInstance(140, 140, Image.SCALE_DEFAULT));
                img16.setIcon(imgPhoto);
                
                clicks++;
            }
            else
            {
                label2 = img16;   

                nro2 = img16.getText();
                
                ImageIcon imgPhoto = new ImageIcon(new ImageIcon("build/classes/iconesmemoria/" + imagens[Integer.parseInt(nro2)]).getImage().getScaledInstance(140, 140, Image.SCALE_DEFAULT));
                img16.setIcon(imgPhoto);
                
                comparar();
                clicks = 0;
            }
        }
    }//GEN-LAST:event_img16MouseClicked

    private void playMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playMouseClicked
        playmusic();
    }//GEN-LAST:event_playMouseClicked

    private void proxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proxMouseClicked
        proximamusica();
    }//GEN-LAST:event_proxMouseClicked

    private void antMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_antMouseClicked
        proximamusica();
    }//GEN-LAST:event_antMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ant;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img10;
    private javax.swing.JLabel img11;
    private javax.swing.JLabel img12;
    private javax.swing.JLabel img13;
    private javax.swing.JLabel img14;
    private javax.swing.JLabel img15;
    private javax.swing.JLabel img16;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel img3;
    private javax.swing.JLabel img4;
    private javax.swing.JLabel img5;
    private javax.swing.JLabel img6;
    private javax.swing.JLabel img7;
    private javax.swing.JLabel img8;
    private javax.swing.JLabel img9;
    private javax.swing.JLabel inic;
    private javax.swing.JLabel linha;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logo2;
    private javax.swing.JLabel logo3;
    private javax.swing.JLabel play;
    private javax.swing.JLabel player;
    private javax.swing.JLabel prox;
    private javax.swing.JLabel sort;
    private javax.swing.JLabel wallpaper;
    // End of variables declaration//GEN-END:variables
}
