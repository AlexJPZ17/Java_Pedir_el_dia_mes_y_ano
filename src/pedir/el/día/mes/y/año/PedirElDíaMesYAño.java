package pedir.el.día.mes.y.año;

import java.util.Scanner;
import javax.swing.*;


public class PedirElDíaMesYAño {

    public static void main(String[] args) {
       /* Scanner Entrada = new Scanner(System.in);
        int dia,mes,año;
        System.out.print("Introduzca día: ");
        dia=Entrada.nextInt();
        System.out.print("Introduzca mes: ");
        mes=Entrada.nextInt();
        System.out.print("Introduzca año: ");
        año=Entrada.nextInt();
       /// el único año que no existe es el 0
        if(año==0){
            System.out.println("Fecha incorrecta");
        }else{
            //Mes de febrero
            if(mes==2 && (dia>=1 && dia<=28)){
                System.out.println(dia + "/" + mes + "/" + año+": Fecha correcta");
            }else{
                //Para los meses de abril,junio,septiembre,noviembre
                if((mes==4 || mes==6 || mes==9 || mes==11) &&(dia>=1 && dia<=30)){
                   System.out.println(dia + "/" + mes + "/" + año+": Fecha correcta"); 
                }else{
                    //Para los meses de enero,marzo,mayo,julio,agosto,octubre,diciembre
                    if( (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) &&
                      (dia>=1 && dia<=31)){
                        System.out.println(dia + "/" + mes + "/" + año+": Fecha correcta");
                    }else{
                        System.out.println("Fecha incorrecta");
                    }
                }
           }
        }
    }*/
        int dia,mes,año;
        String Entrda;
        Entrda=JOptionPane.showInputDialog(null,"Introduzca Día");
        dia=Integer.parseInt(Entrda);
        Entrda=JOptionPane.showInputDialog(null,"Introduzca Mes");
        mes=Integer.parseInt(Entrda);
        Entrda=JOptionPane.showInputDialog(null,"Introduzca Año");
        año=Integer.parseInt(Entrda);
    /// el único año que no existe es el 0
        if(año==0){
            JOptionPane.showMessageDialog(null,"Fecha incorrecta");
        }else{
            //Mes de febrero
            if(mes==2 && (dia>=1 && dia<=28)){
                JOptionPane.showMessageDialog(null,dia + "/" + mes + "/" + año+": Fecha correcta");
            }else{
                //Para los meses de abril,junio,septiembre,noviembre
                if((mes==4 || mes==6 || mes==9 || mes==11) &&(dia>=1 && dia<=30)){
                   JOptionPane.showMessageDialog(null,dia + "/" + mes + "/" + año+": Fecha correcta"); 
                }else{
                    //Para los meses de enero,marzo,mayo,julio,agosto,octubre,diciembre
                    if( (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) &&
                      (dia>=1 && dia<=31)){
                        JOptionPane.showMessageDialog(null,dia + "/" + mes + "/" + año+": Fecha correcta");
                    }else{
                        JOptionPane.showMessageDialog(null,"Fecha incorrecta");
                    }
                }
            }
        }
   }
}


