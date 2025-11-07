
## Pobieranie elementow aplikacji po id

```
textViewPodp = findViewById(R.id.textViewPodp);
```

## Background color ***Button***'a

```
xml > android:backgroundTint="#333333"

java > tak.setBackgroundColor(Color.rgb(51,51,51));
```

## onClickListener

```
btnNie.setOnClickListener(
    new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            
        }
    }
);
```

## Ustawianie tekstu ***TextView***

```
textViewKoniec.setText("Koniec testu!");
```

## Toast

```
Toast.makeText(this, R.string.you_clicked_the_button, Toast.LENGTH_SHORT).show();
```

## "Znikanie" elementow

```
linearLayoutInterfejs.setVisibility(View.GONE);
```
