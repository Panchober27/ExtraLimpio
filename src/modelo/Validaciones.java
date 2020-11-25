/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.event.KeyEvent;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Francisco
 */
public class Validaciones {

    public Validaciones() {
    }
    
    
    /**
     * Metodo que valida que un txt no este vacio!
     * @param param String que contiene los caracteres del componente txt_algo desde la interfaz.
     * @return false: si el componente NO tiene caracteres / true: si el componente tiene caracteres.
     */
    public static boolean validarTxt(String param){
        boolean par;
        if(!param.isEmpty()){
            par = true;
        } else {
            par = false;
        }
        
        return par;
    }
    
    
    
    /*
     * Metodo para validar el Rut y su Digito Verificador
     * Retorna true: si el rut y el dv son validos.
     * Retorna false: si el rut no coincide con el DV.
    */
    public static boolean validarRut(String rut, String dv) {
        try {
            int j = 2, acum = 0;
            for (int i = rut.length() - 1; i >= 0; i--) {
                if (j == 8) {
                    j = 2;
                }
                acum += Integer.parseInt(rut.substring(i, i + 1)) * j;
                j++;
            }
            int resto = acum % 11;
            int dv1 = 11 - resto;
            switch (Integer.toString(dv1)) {
                case "11":
                    return dv.equals("0");
                case "10":
                    return dv.equals("K") || dv.equals("k");
                default:
                    return dv.equals(Integer.toString(dv1));
            }
        } catch (NumberFormatException e) {
            return false;
        }
    }//Fin del Metodo
    
    
    
    /**
     * Este metodo valida que los usuraios ingresen solo numeros del 0 al 9 o la letra K
     * @param e Evento que se genera cuando el usuario realiza un tipeo con las teclas en el componente.
     * @param s String que contiene lo que el usuario tipeo en el componente
     */
    public static void validarDV(KeyEvent e, String s){
        if(s.length() == 1){
            e.consume();
        } else {
            char c = e.getKeyChar();
            if(!Character.isDigit(c) && c != 'k' && c != 'K' && c != KeyEvent.VK_BACK_SPACE){
                e.consume();
                JOptionPane.showMessageDialog(null, "Puede ingresar solo digitos del 0 al 9 o la letra K.");
            }
        }
    }// Fin del Metodo.
    
    /**
     * Este metodo verifica que se ingresen solo letras en un componente TextField.
     * @param e: Corresponde al KeyEvent del tipeo sobre el Componente TextField
     */
    public static void validarLetras(KeyEvent e){
        char c = e.getKeyChar();
        if(!Character.isLetter(c) && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_SPACE){
            e.consume();
            JOptionPane.showMessageDialog(null, "Debe Ingresar solo Letras.");
        }
    }//Fin del Metodo.

    
    /**
     * Metodo para validar que se ingresen solo Numeros.
     * @param e Evento que se genera cuando el usuario realiza un tipeo con las teclas en el componente.
     */
    public static void validarNumero(KeyEvent e){
        char c = e.getKeyChar();
        
        if(!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE){
            e.consume();
            JOptionPane.showMessageDialog(null, "Debe Ingresar solo Numeros.");
        }
    }// Fin del Metodo.
    
    
    
    /**
     * 
     * @param email String que contiene lo que el usuario ingreso en el componente del email en la interfaz.
     * @return true, si los caracteres cumplen con la expresion regular asignada al metodo.
     */
    public static boolean validarEmail(String email){
        Pattern pat = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher match = pat.matcher(email);
        return match.find();
    }// Fin del Metodo
    
    
    /**
     * Metodo para obtener la fecha Actual Oficial.
     * Este metodo se utiliza en las Interfaces, para temas visuales, como para validaciones del sistema.
     * @return String con Fecha(dia/mes/año) y Hora(horas/minutos/segundos).
     */
    public static String getFecha(){
        
        Calendar fecha = Calendar.getInstance();
        
        String Dia = Integer.toString(fecha.get(Calendar.DATE));
        String Mes = Integer.toString(fecha.get(Calendar.MONTH) + 1);
        String Año = Integer.toString(fecha.get(Calendar.YEAR));
        String HrAct = fecha.get(fecha.HOUR_OF_DAY)+":"+fecha.get(fecha.MINUTE)+":"+fecha.get(fecha.SECOND);
        
        String fechaOficial = "Fecha: " + Dia + "/" + Mes + "/" + Año + "\n"
                + "  Hora Actual: " + HrAct;
        
        return fechaOficial;
        
    }
    
    
    

}
