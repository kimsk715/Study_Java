package streamTask;

import streamTask.DBConnecter;
import streamTask.Product;

public class Market {
	public void add(Product product) {
		DBConnecter.products.add(product);
	}
}
