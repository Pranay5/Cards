package com.example.pranayarora.cards;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by Pranay Arora on 11-06-2018.
 */

class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder>{


    List<ContactInfo> contactList;

    ContactAdapter(List<ContactInfo> contactList)
    {
        this.contactList=contactList;
    }


    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout, parent ,false);

        return new ContactViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, int i) {

        ContactInfo ci = contactList.get(i);
        holder.VSurname.setText(ci.email);
        holder.vEmail.setText(ci.email);
        holder.VTitle.setText(ci.name+ "" + ci.surname);

    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    public class ContactViewHolder extends RecyclerView.ViewHolder {

        private final  TextView VName,VSurname,vEmail,VTitle;

        public ContactViewHolder(View V) {
            super(V);
            VName = (TextView) V.findViewById(R.id.txtName);
            VSurname = (TextView) V.findViewById(R.id.txtSurname);
            vEmail = (TextView) itemView.findViewById(R.id.txtEmail);
             VTitle = (TextView) itemView.findViewById(R.id.title);

        }
    }
}
