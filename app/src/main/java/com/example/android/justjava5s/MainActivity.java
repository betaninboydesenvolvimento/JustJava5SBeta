package com.example.android.justjava5s;

/**
 * Add your package below. Package name can be found in the project's AndroidManifest.xml file.
 * This is the package name our example uses:
 * <p>
 * package com.example.android.justjava5s;
 */

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.justjava5s.R;

import java.text.NumberFormat;

import static android.R.attr.checked;
import static android.R.attr.name;
import static android.R.attr.y;

/**
 * Este aplicativo exibe um percentual de aplicação do programa 5S em uma empresa qualquer
 */
public class MainActivity extends AppCompatActivity {
    int quantity = 100;

    int baseResultado = 0;

    /**
     * private boolean addMedioDiscplina;
     * <p>
     * private boolean addMedioPadronizaçao;
     * <p>
     * private boolean addMedioLimpeza;
     * <p>
     * private boolean addMedioOrganizaçao;
     * <p>
     * private boolean addMedioUtilizaçao;
     * <p>
     * private boolean addOkDiscplina;
     * <p>
     * private boolean addOkPadronizaçao;
     * <p>
     * private boolean addOkLimpeza;
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Esse método é chamado quando o botão de ordem é clicado.
     */


    public void nota(View view) {
        /**Este check box serve para colocar a caixa de seleção, o boolean é chamado para verificar
         *  no id que foi colocado no findViewById, trazendo assim o valor verdadeiro ou falso.
         *
         */

        EditText nameField = (EditText) findViewById(R.id.name_field);
        String name = nameField.getText().toString();

        CheckBox okUtilizaçaoCheckBox = (CheckBox) findViewById(R.id.ok_utilizaçao_checkbox);
        boolean hasOkUtilizaçao = okUtilizaçaoCheckBox.isChecked();

        CheckBox okOrganizaçaoCheckBox = (CheckBox) findViewById(R.id.ok_organizaçao_checkbox);
        boolean hasOkOrganizaçao = okOrganizaçaoCheckBox.isChecked();


        CheckBox okLimpezaCheckBox = (CheckBox) findViewById(R.id.ok_limpeza_checkbox);
        boolean hasOkLimpeza = okLimpezaCheckBox.isChecked();

        CheckBox okPadronizaçaoCheckBox = (CheckBox) findViewById(R.id.ok_padronizaçao_checkbox);
        boolean hasOkPadronizaçao = okPadronizaçaoCheckBox.isChecked();

        CheckBox okDisciplinaCheckBox = (CheckBox) findViewById(R.id.ok_disciplina_checkbox);
        boolean hasOkDisciplina = okDisciplinaCheckBox.isChecked();

        Log.v("MainActivity", "Has Ok Utilização " + hasOkUtilizaçao);

        /** Estes campos pertencem ao checkbox dos regular
         */

        CheckBox medioUtilizaçaoCheckBox = (CheckBox) findViewById(R.id.medio_utilizaçao_checkbox);
        boolean hasMedioUtilizaçao = medioUtilizaçaoCheckBox.isChecked();

        CheckBox medioOrganizaçaoCheckBox = (CheckBox) findViewById(R.id.medio_organizaçao_checkbox);
        boolean hasMedioOrganizaçao = medioOrganizaçaoCheckBox.isChecked();

        CheckBox medioLimpezaCheckBox = (CheckBox) findViewById(R.id.medio_limpeza_checkbox);
        boolean hasMedioLimpeza = medioLimpezaCheckBox.isChecked();

        CheckBox medioPadronizaçaoCheckBox = (CheckBox) findViewById(R.id.medio_padronizaçao_checkbox);
        boolean hasMedioPadronizaçao = medioPadronizaçaoCheckBox.isChecked();

        CheckBox medioDisciplinaCheckBox = (CheckBox) findViewById(R.id.medio_disciplina_checkbox);
        boolean hasMedioDisciplina = medioDisciplinaCheckBox.isChecked();

        /** Estes campos pertencem ao checkbox dos Não Ok
         */
        /**
         CheckBox erradoUtilizaçaoCheckBox = (CheckBox) findViewById(R.id.errado_utilizaçao_checkbox);
         boolean hasErradoUtilizaçao = erradoUtilizaçaoCheckBox.isChecked();

         CheckBox erradoOrganizaçaoCheckBox = (CheckBox) findViewById(R.id.errado_organizaçao_checkbox);
         boolean hasErradoOrganizaçao = erradoOrganizaçaoCheckBox.isChecked();

         CheckBox erradoLimpezaCheckBox = (CheckBox) findViewById(R.id.errado_limpeza_checkbox);
         boolean hasErradoLimpeza = erradoLimpezaCheckBox.isChecked();

         CheckBox erradoPadronizaçaoCheckBox = (CheckBox) findViewById(R.id.errado_padronizaçao_checkbox);
         boolean hasErradoPadronizaçao = erradoPadronizaçaoCheckBox.isChecked();

         CheckBox erradoDisciplinaCheckBox = (CheckBox) findViewById(R.id.errado_disciplina_checkbox);
         boolean hasErradoDisciplina = erradoDisciplinaCheckBox.isChecked();
         }

         /**
         * Log.v serve para verificar que funciona a seleção na caixa. E verifica na parte inferior
         * do android studio "Android Monitor" aparecendo True ou False.
         */

        if (hasMedioDisciplina == hasOkDisciplina) {
            // Show an error message as a toast
            Toast.makeText(this, "Você não podes selecionar duas opções do mesmo senso",
                    Toast.LENGTH_SHORT).show();
            // Exit this method early because there's nothing left to do
            return;
        }

        if (hasMedioPadronizaçao == hasOkPadronizaçao) {
            // Show an error message as a toast
            Toast.makeText(this, "Você não podes selecionar duas opções do mesmo senso",
                    Toast.LENGTH_SHORT).show();
            // Exit this method early because there's nothing left to do
            return;
        }

        if (hasMedioLimpeza == hasOkLimpeza) {
            // Show an error message as a toast
            Toast.makeText(this, "Você não podes selecionar duas opções do mesmo senso",
                    Toast.LENGTH_SHORT).show();
            // Exit this method early because there's nothing left to do
            return;
        }

        if (hasMedioOrganizaçao == hasOkOrganizaçao) {
            // Show an error message as a toast
            Toast.makeText(this, "Você não podes selecionar duas opções do mesmo senso",
                    Toast.LENGTH_SHORT).show();
            // Exit this method early because there's nothing left to do
            return;
        }

        if (hasMedioUtilizaçao == hasOkUtilizaçao) {
            // Show an error message as a toast
            Toast.makeText(this, "Você não podes selecionar duas opções do mesmo senso",
                    Toast.LENGTH_SHORT).show();
            // Exit this method early because there's nothing left to do
            return;
        }


        int resultado = createResultado(hasOkUtilizaçao, hasOkOrganizaçao, hasOkLimpeza,
                hasOkPadronizaçao, hasOkDisciplina, hasMedioUtilizaçao, hasMedioOrganizaçao,
                hasMedioLimpeza, hasMedioPadronizaçao, hasMedioDisciplina);
        String resultadoMessage = resultadoSummaryTextView(name, resultado, hasOkUtilizaçao,
                hasOkOrganizaçao, hasOkLimpeza, hasOkPadronizaçao, hasOkDisciplina,
                hasMedioUtilizaçao, hasMedioOrganizaçao, hasMedioLimpeza, hasMedioPadronizaçao,
                hasMedioDisciplina);


        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, "Auditoria do setor " + name);
        intent.putExtra(Intent.EXTRA_TEXT, resultadoMessage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }


        displayMessage(resultadoMessage);
        {

        }
    }


    private int createResultado(boolean addOkUtilizaçao, boolean addOkOrganizaçao, boolean
            addOkLimpeza, boolean addOkPadronizaçao, boolean addOkDisciplina, boolean
                                        addMedioUtilizaçao, boolean addMedioOrganizaçao, boolean addMedioLimpeza, boolean
                                        addMedioPadronizaçao, boolean addMedioDisciplina) {

        int basePrice = 0;

        int basePriceUtilizaçao = 0;

        int basePriceOrganizaçao = 0;

        int basePriceLimpeza = 0;

        int basePricePadronizaçao = 0;

        int basePriceDisciplina = 0;

        if (addOkUtilizaçao) {
            basePriceUtilizaçao = basePrice + 2;
        }

        if (addOkOrganizaçao) {
            basePriceOrganizaçao = basePrice + 2;
        }

        if (addOkLimpeza) {
            basePriceLimpeza = basePrice + 2;
        }

        if (addOkPadronizaçao) {
            basePricePadronizaçao = basePrice + 2;
        }

        if (addOkDisciplina) {
            basePriceDisciplina = basePrice + 2;
        }

        if (addMedioUtilizaçao) {
            basePriceUtilizaçao = basePrice + 1;
        }

        if (addMedioOrganizaçao) {
            basePriceOrganizaçao = basePrice + 1;
        }

        if (addMedioLimpeza) {
            basePriceLimpeza = basePrice + 1;
        }

        if (addMedioPadronizaçao) {
            basePricePadronizaçao = basePrice + 1;
        }

        if (addMedioDisciplina) {
            basePriceDisciplina = basePrice + 1;
        }

        return (quantity * (basePriceUtilizaçao + basePriceOrganizaçao + basePriceLimpeza +
                basePricePadronizaçao + basePriceDisciplina)) / 10;
    }

    private String resultadoSummaryTextView(String name, int resultado, boolean addOkUtlizaçao,
                                            boolean addOkOrganizaçao, boolean addOkLimpeza, boolean
                                                    addOkPadronizaçao, boolean addOkDisciplina, boolean
                                                    addMedioUtilizaçao, boolean addMedioOrganizaçao, boolean
                                                    addMedioLimpeza, boolean addMedioPadronizaçao, boolean
                                                    addMedioDisciplina) {
        String resultadoMessage = "Setor : " + name;
        resultadoMessage += "\n ";
        resultadoMessage += "\nNota: " + resultado + " %";
        resultadoMessage += "\n ";
        resultadoMessage += "\n";
        resultadoMessage += "\nUtilização Ok? " + addOkUtlizaçao + "\nUtilização Não Ok? " +
                addMedioUtilizaçao;
        resultadoMessage += "\n ";
        resultadoMessage += "\nOrganização Ok? " + addOkOrganizaçao + "\nOrganização Não Ok? " +
                addMedioOrganizaçao;
        resultadoMessage += "\n ";
        resultadoMessage += "\nLimpeza Ok? " + addOkLimpeza + "\nLimpeza Não Ok? " + addMedioLimpeza
        ;
        resultadoMessage += "\n ";
        resultadoMessage += "\nPadronização Ok? " + addOkPadronizaçao + "\nPadronização Não Ok? " +
                addMedioPadronizaçao;
        resultadoMessage += "\n ";
        resultadoMessage += "\n\nDisciplina Ok? " + addOkDisciplina + "\nDisciplina Não Ok? " +
                addMedioDisciplina;

        return resultadoMessage;
    }

    private void displayMessage(String message) {
        TextView resultadoSummaryTextView = (TextView) findViewById(R.id.resultado_summary_text_view);
        resultadoSummaryTextView.setText(message);
    }
}
