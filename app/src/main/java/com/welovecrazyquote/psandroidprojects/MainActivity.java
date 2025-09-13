package com.welovecrazyquote.psandroidprojects;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        RecyclerView list = findViewById(R.id.recycler_view_projects);
        Project[] projects = {
                new Project("Getting Started App", "Our very first project that displays the classic 'Hello World' to learn the basics of Android development.", R.drawable.getting_started),
                new Project("Crazy Quote", "An app that shows random motivational and fun quotes every time you open it.", R.drawable.quote),
                new Project("BMI Calculator", "A simple health tool to calculate Body Mass Index based on height and weight.", R.drawable.calculator),
                new Project("Inches Converter", "A handy converter app that lets users quickly switch between inches, centimeters, and other units.", R.drawable.tape),
                new Project("The Hungry Minds", "A restaurant-style demo app featuring menus, categories, and navigation with RecyclerView and CardView.", R.drawable.hungry_developer),

        };
        ProjectAdapter adapter = new ProjectAdapter(projects);
        list.setAdapter(adapter);
    }
}