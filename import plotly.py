import plotly.graph_objects as go

x_data = ["Január", "Február", "Marec", "Apríl"]
y_data = [10, 15, 13, 17]

# Vytvorenie grafu
fig = go.Figure(
    data= go.Scatter(
        x = x_data,
        y= y_data,
        mode = "text+lines+markers",
        text = ["A", "B", "C", "D"],
        textfont= dict(size=24),
        textposition= "top center"
    )
)
        
fig.show()      