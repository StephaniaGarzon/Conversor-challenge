package conversorTemperatura;

import javax.swing.JOptionPane;

public class ConvertirTemperatura {
	
	public double ConvertirCelciusAFarenheit(double valor) {
		double farenheit = valor * 1.8 + 32;
    	farenheit = (double) Math.round(farenheit *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Grados Celsius son " +farenheit+ " Grados Farenheit ");
		return farenheit;
	}
	
	public void ConvertirCelciusAKelvin(double valor){
		double kelvin = valor + 273.15;
        kelvin = (double) Math.round(kelvin *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Grados Celsius son " +kelvin+ " Kelvin");
	}
	
	public void ConvertirFarenheitACelcius(double valor) {
		double celcius = (valor - 32) / 1.8;
        celcius = (double) Math.round(celcius *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Grados Farenheit son " +celcius+ " Celsius");
	}
	
	public void ConvertirFarenheitAKelvin(double valor) {
		double kelvin = (valor - 32) * 1.8 + 273.15;
        kelvin = (double) Math.round(kelvin *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Grados Farenheit son " +kelvin+ " Kelvin");
	}
	
	public double ConvertirKelvinACelcius(double valor) {
		 double kelvinCelcius = valor - 273.15;
         kelvinCelcius = (double) Math.round(kelvinCelcius *100d)/100;
         JOptionPane.showMessageDialog(null, +valor+ " Kelvin son " +kelvinCelcius+ " Celsius");
         return kelvinCelcius;
	}
	
	public void ConvertirKelvinAFarenheit(double valor) {
		double kelvinFarenheit = ConvertirKelvinACelcius(valor);
		kelvinFarenheit = ConvertirCelciusAFarenheit(kelvinFarenheit);
		kelvinFarenheit	= (double) Math.round(kelvinFarenheit *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Kelvin son " +kelvinFarenheit+ " Farenheit");
	}

}
