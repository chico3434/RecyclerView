package br.chico.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import br.chico.recyclerview.model.Person;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.ViewHolderPerson> {

    private List<Person> dataSet;

    public PersonAdapter(List<Person> dataSet) {
        this.dataSet = dataSet;
    }

    @Override
    public PersonAdapter.ViewHolderPerson onCreateViewHolder(ViewGroup viewGroup, int i) {

        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());

        View view = layoutInflater.inflate(R.layout.list_line, viewGroup, false);

        ViewHolderPerson holderPerson = new ViewHolderPerson(view);

        return holderPerson;
    }

    @Override
    public void onBindViewHolder(ViewHolderPerson viewHolderPerson, int i) {
        if (dataSet != null && dataSet.size() > 0) {
            Person person = dataSet.get(i);

            viewHolderPerson.textName.setText(person.getName());

            viewHolderPerson.textAge.setText(String.valueOf(person.getAge()));
        }
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public class ViewHolderPerson extends RecyclerView.ViewHolder {

        public TextView textName;

        public TextView textAge;

        public ViewHolderPerson(View itemView) {
            super(itemView);

            textName = itemView.findViewById(R.id.textName);

            textAge = itemView.findViewById(R.id.textAge);
        }
    }
}
