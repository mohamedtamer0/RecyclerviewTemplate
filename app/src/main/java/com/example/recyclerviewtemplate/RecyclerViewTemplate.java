package com.example.recyclerviewtemplate;

///// Just Copy this code and past in your Project \\\\\

#if(${PACKAGE_NAME} && ${PACKAGE_NAME} != "") package ${PACKAGE_NAME};

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class ${NAME} extends RecyclerView.Adapter<${NAME}.${ViewHolder_NAME}> {
private ArrayList<${Model_NAME}> OJGName = new ArrayList<${Model_NAME}>();
@NonNull
@Override
public ${ViewHolder_NAME} onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ${ViewHolder_NAME}(LayoutInflater.from(parent.getContext()).inflate(R.layout.${item_NAME}, parent,false));
        }

@Override
public void onBindViewHolder(@NonNull ${ViewHolder_NAME} holder, int position) {
        }

@Override
public int getItemCount() {
        return OJGName.size();
        }

public class ${ViewHolder_NAME} extends RecyclerView.ViewHolder {
public ${ViewHolder_NAME}(@NonNull View itemView) {
        super(itemView);
        }
        }
        }
