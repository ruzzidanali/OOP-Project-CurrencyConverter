/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currencyconverter;
import java.util.ArrayList;
import java.util.HashMap;

public class Currency {
    private String name;
    private String shortName;
    private HashMap<String, Double> exchangeValues = new HashMap<String, Double>();
	
	// "Currency" Constructor
    public Currency(String nameValue, String shortNameValue) {
        this.name = nameValue;
        this.shortName = shortNameValue;
    }
	
	// Getter for name
    public String getName() {
        return this.name;
    }
	
	// Setter for name
    public void setName(String name) {
        this.name = name;
    }
	
	// Getter for shortName
    public String getShortName() {
        return this.shortName;
    }
	
	// Setter for shortName
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }
	
	// Getter for exchangeValues
    public HashMap<String, Double> getExchangeValues() {
        return this.exchangeValues;
    }
	
	// Setter for exchangeValues
    public void setExchangeValues(String key, Double value) {
        this.exchangeValues.put(key, value);
    }
	
	// Set default values for a currency
    public void defaultValues() {
        String currency = this.name;
                switch (currency) {	
                    case "US Dollar":
                        this.exchangeValues.put("USD", 1.00);
			this.exchangeValues.put("EUR", 0.83);
			this.exchangeValues.put("GBP", 0.72);
			this.exchangeValues.put("CHF", 0.91);
                        this.exchangeValues.put("CNY", 6.47);
			this.exchangeValues.put("JPY", 109.30);
                        this.exchangeValues.put("MYR", 4.10);
                        break;
                    case "Euro":
			this.exchangeValues.put("USD", 1.20);
			this.exchangeValues.put("EUR", 1.00);
                        this.exchangeValues.put("GBP", 0.87);
			this.exchangeValues.put("CHF", 1.10);
			this.exchangeValues.put("CNY", 7.78);
			this.exchangeValues.put("JPY", 131.36);
                        this.exchangeValues.put("MYR", 4.92);
                        break;
                    case "British Pound":
                        this.exchangeValues.put("USD", 1.38);
			this.exchangeValues.put("EUR", 1.15);
			this.exchangeValues.put("GBP", 1.00);
			this.exchangeValues.put("CHF", 1.26);
                        this.exchangeValues.put("CNY", 8.95);
			this.exchangeValues.put("JPY", 151.05);
                        this.exchangeValues.put("MYR", 5.66);
                        break;
                    case "Swiss Franc":
			this.exchangeValues.put("USD", 1.10);
			this.exchangeValues.put("EUR", 0.91);
                        this.exchangeValues.put("GBP", 0.79);
                        this.exchangeValues.put("CHF", 1.00);
                        this.exchangeValues.put("CNY", 7.09);
			this.exchangeValues.put("JPY", 119.74);
                        this.exchangeValues.put("MYR", 4.49);
                        break;
                    case "Chinese Yuan Renminbi":
			this.exchangeValues.put("USD", 0.15);
			this.exchangeValues.put("EUR", 0.13);
                        this.exchangeValues.put("GBP", 0.11);
			this.exchangeValues.put("CHF", 0.14);
			this.exchangeValues.put("CNY", 1.00);
			this.exchangeValues.put("JPY", 16.88);
                        this.exchangeValues.put("MYR",0.63);
                        break;
                    case "Japanese Yen":
                        this.exchangeValues.put("USD", 0.0091);
			this.exchangeValues.put("EUR", 0.0076);
			this.exchangeValues.put("GBP", 0.0066);
			this.exchangeValues.put("CHF", 0.0083);
                        this.exchangeValues.put("CNY", 0.059);
			this.exchangeValues.put("JPY", 1.000);
                        this.exchangeValues.put("MYR", 0.037);
                        break;
                    case"Malaysian Ringgit":
                        this.exchangeValues.put("USD", 0.24);
			this.exchangeValues.put("EUR", 0.20);
			this.exchangeValues.put("GBP", 0.18);
			this.exchangeValues.put("CHF", 0.22);
                        this.exchangeValues.put("CNY", 1.58);
			this.exchangeValues.put("JPY", 26.69);
                        this.exchangeValues.put("MYR", 1.00);
                            
                }
    }
	
	// Initialize currencies
    public static ArrayList<Currency> init() {
        ArrayList<Currency> currencies = new ArrayList<Currency>();
        
        currencies.add( new Currency("US Dollar", "USD") );
	currencies.add( new Currency("Euro", "EUR") );
        currencies.add( new Currency("British Pound", "GBP") );
	currencies.add( new Currency("Swiss Franc", "CHF") );
        currencies.add( new Currency("Chinese Yuan Renminbi", "CNY") );
	currencies.add( new Currency("Japanese Yen", "JPY") );
        currencies.add( new Currency("Malaysian Ringgit", "MYR"));
		
        for (Integer i =0; i < currencies.size(); i++) {
            currencies.get(i).defaultValues();
        }		
        
        return currencies;
    }
	
	// Convert a currency to another
    public static Double convert(Double amount, Double exchangeValue) {
        Double price;
        price = amount * exchangeValue;
        price = Math.round(price * 100d) / 100d;
		
        return price;
    }
}
