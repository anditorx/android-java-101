package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] listTopics = {
            "Changi Airport (SIN) - Singapura",
            "Dubai International Airport (DXB) - Dubai, Uni Emirat Arab",
            "Narita International Airport (NRT) - Tokyo, Jepang",
            "Hong Kong International Airport (HKG) - Hong Kong",
            "Incheon International Airport (ICN) - Incheon, Korea Selatan",
            "Suvarnabhumi Airport (BKK) - Bangkok, Thailand",
            "Indira Gandhi International Airport (DEL) - Delhi, India",
            "Beijing Capital International Airport (PEK) - Beijing, Tiongkok",
            "Kuala Lumpur International Airport (KUL) - Kuala Lumpur, Malaysia",
            "Tan Son Nhat International Airport (SGN) - Ho Chi Minh City, Vietnam",
            "Soekarno-Hatta International Airport (CGK) - Jakarta, Indonesia",
            "Shanghai Pudong International Airport (PVG) - Shanghai, Tiongkok",
            "Seoul Gimpo International Airport (GMP) - Seoul, Korea Selatan",
            "Taiwan Taoyuan International Airport (TPE) - Taipei, Taiwan",
            "Hamad International Airport (DOH) - Doha, Qatar",
            "King Abdulaziz International Airport (JED) - Jeddah, Arab Saudi",
            "Rajiv Gandhi International Airport (HYD) - Hyderabad, India",
            "Phuket International Airport (HKT) - Phuket, Thailand",
            "Sultan Hasanuddin International Airport (UPG) - Makassar, Indonesia",
            "Netaji Subhas Chandra Bose International Airport (CCU) - Kolkata, India",
            "Heathrow Airport (LHR) - London, Inggris",
            "Charles de Gaulle Airport (CDG) - Paris, Prancis",
            "Munich Airport (MUC) - Munich, Jerman",
            "Adolfo Suárez Madrid–Barajas Airport (MAD) - Madrid, Spanyol",
            "Amsterdam Airport Schiphol (AMS) - Amsterdam, Belanda",
            "Zurich Airport (ZRH) - Zurich, Swiss",
            "Leonardo da Vinci–Fiumicino Airport (FCO) - Rome, Italia",
            "Copenhagen Airport (CPH) - Copenhagen, Denmark",
            "Vienna International Airport (VIE) - Vienna, Austria",
            "Frankfurt Airport (FRA) - Frankfurt, Jerman",
            "Barcelona–El Prat Airport (BCN) - Barcelona, Spanyol",
            "Dublin Airport (DUB) - Dublin, Irlandia",
            "Sheremetyevo International Airport (SVO) - Moscow, Rusia",
            "Oslo Airport (OSL) - Oslo, Norwegia",
            "Athens International Airport (ATH) - Athens, Yunani",
            "Stockholm Arlanda Airport (ARN) - Stockholm, Swedia",
            "Lisbon Airport (LIS) - Lisbon, Portugal",
            "Brussels Airport (BRU) - Brussels, Belgia",
            "Geneva Airport (GVA) - Geneva, Swiss",
            "Helsinki-Vantaa Airport (HEL) - Helsinki, Finlandia",
            "Los Angeles International Airport (LAX) - Los Angeles, Amerika Serikat",
            "O'Hare International Airport (ORD) - Chicago, Amerika Serikat",
            "John F. Kennedy International Airport (JFK) - New York City, Amerika Serikat",
            "Hartsfield-Jackson Atlanta International Airport (ATL) - Atlanta, Amerika Serikat",
            "Dallas/Fort Worth International Airport (DFW) - Dallas, Amerika Serikat",
            "Denver International Airport (DEN) - Denver, Amerika Serikat",
            "San Francisco International Airport (SFO) - San Francisco, Amerika Serikat",
            "Seattle-Tacoma International Airport (SEA) - Seattle, Amerika Serikat",
            "Miami International Airport (MIA) - Miami, Amerika Serikat",
            "McCarran International Airport (LAS) - Las Vegas, Amerika Serikat",
            "Toronto Pearson International Airport (YYZ) - Toronto, Kanada",
            "Vancouver International Airport (YVR) - Vancouver, Kanada",
            "Mexico City International Airport (MEX) - Mexico City, Meksiko",
            "Jorge Chávez International Airport (LIM) - Lima, Peru",
            "Ministro Pistarini International Airport (EZE) - Buenos Aires, Argentina",
            "Guarulhos–Governador André Franco Montoro International Airport (GRU) - São Paulo, Brasil",
            "El Dorado International Airport (BOG) - Bogotá, Kolombia",
            "Tocumen International Airport (PTY) - Panama City, Panama",
            "T.F. Green Airport (PVD) - Providence, Amerika Serikat",
            "Juan Santamaría International Airport (SJO) - San Jose, Kosta Rika"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);
        ArrayAdapter adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_dropdown_item_1line, listTopics);
        listView.setAdapter(adapter);

        getSupportActionBar().setTitle("Learn List View");

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "You have clicked on "+listTopics[i], Toast.LENGTH_SHORT).show();
            }
        });



    }
}