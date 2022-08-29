package conversorTemperatura;

import javax.swing.JOptionPane;

public class functionTemperatura {
	
	ConvertirTemperatura temperatura = new ConvertirTemperatura();
	
	public void ConvertirTemperatura(double Minput) {
    	String opcion = (JOptionPane.showInputDialog(null, "Elije una opción para convertir", "Temperatura", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Grados Celsius a Grados Farenheit", "Grados Celsius a Kelvin", "Grados Farenheit a Grados Celsius", "Grados Farenheit a Kelvin", "Kelvin a Grados Celsius","Kelvin a Grados Farenheit"}, "Seleccion")).toString();
        switch(opcion) {
        case "Grados Celsius a Grados Farenheit":
        	temperatura.ConvertirCelciusAFarenheit(Minput);
        	break;
        case "Grados Celsius a Kelvin":
            temperatura.ConvertirCelciusAKelvin(Minput);
            break;
        case "Grados Farenheit a Grados Celsius":
           temperatura.ConvertirFarenheitACelcius(Minput);
           break;
        case "Grados Farenheit a Kelvin":
            temperatura.ConvertirFarenheitAKelvin(Minput);
            break;
        case "Kelvin a Grados Celsius":
           temperatura.ConvertirKelvinACelcius(Minput);
           break;
        case "Kelvin a Grados Farenheit":
        	temperatura.ConvertirKelvinAFarenheit(Minput);
        	break;
        }
	}
}
    	
     


