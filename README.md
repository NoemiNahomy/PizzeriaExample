#Practica de patrones de diseño

###Lista de endpoints disponibles
Patrones usados 
*Builder
*Factory
*Singleton
*Strategy

- endpoints:


* localhost:8087/api/pedido/personalizada/SABADO

<code>
{
	"promocion": "Sin promocion, precio normal",
	"pizza": {
		"nombre:": "Personalizada",
		"detalle:": "Pizza{nombre='Personalizada', Maza=false, chorizo=false, queso=true, gramosCarne=1000}"
	}
}
</code>

* localhost:8087/api/pedido/carnivora/MARTES
<code>
{
	"promocion": "Sin promocion, precio normal",
	"pizza": {
		"nombre:": "Carnivora",
		"detalle:": "Pizza{nombre='Carnivora', Maza=false, chorizo=false, queso=true, gramosCarne=1000}"
	}
}
</code>
* localhost:8087/api/pedido/margarita/MARTES


<code>
{
	"promocion": "Sin promocion, precio normal",
	"pizza": {
		"nombre:": "Margarita",
		"detalle:": "Pizza{nombre='Margarita', Maza=false, chorizo=false, queso=true, gramosCarne=200}"
	}
</code>
