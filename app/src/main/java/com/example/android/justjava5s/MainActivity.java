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
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.android.justjava5s.R.id.radio_organizaçao;


/**
 * Este aplicativo exibe um percentual de aplicação do programa 5S em uma empresa qualquer
 */
public class MainActivity extends AppCompatActivity {
    int quantity = 100;

    int baseResultado = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * Esse método é chamado quando o botão da nota é clicado. Mostrando o resultado e realizando
     * conforme a escolha do radio button.
     */

    private int createResultado(RadioGroup radioUtilizaçao, RadioGroup radioOrganizaçao, RadioGroup
            radioLimpeza, RadioGroup radioPadronizaçao, RadioGroup radioDisciplina) {

        int baseCalculo = 0;

        int baseCalculoUtilizaçao = 0;

        int baseCalculoOrganizaçao = 0;

        int baseCalculoLimpeza = 0;

        int baseCalculoPadronizaçao = 0;

        int baseCalculoDisciplina = 0;

        radioUtilizaçao = (RadioGroup) findViewById(R.id.radio_utilizaçao);
        switch (radioUtilizaçao.getCheckedRadioButtonId()) {
            case R.id.radioUtilizaçaoOk:
                baseCalculoUtilizaçao = baseCalculo + 2;
                break;

            case R.id.radioUtilizaçaoRegular:
                baseCalculoUtilizaçao = baseCalculo + 1;
                break;
            case R.id.radioUtilizaçaoNaoOk:
                baseCalculoUtilizaçao = 0;
                break;
        }


        radioOrganizaçao = (RadioGroup) findViewById(radio_organizaçao);
        switch (radioOrganizaçao.getCheckedRadioButtonId()) {
            case R.id.radioOrganizaçaoOk:
                baseCalculoOrganizaçao = baseCalculo + 2;
                break;
            case R.id.radioOrganizaçaoRegular:
                baseCalculoOrganizaçao = baseCalculo + 1;
                break;
            case R.id.radioOrganizaçaoNaoOk:
                baseCalculoOrganizaçao = 0;
                break;
        }

        radioLimpeza = (RadioGroup) findViewById(R.id.radio_limpeza);
        switch (radioLimpeza.getCheckedRadioButtonId()) {
            case R.id.radioLimpezaOk:
                baseCalculoLimpeza = baseCalculo + 2;
                break;
            case R.id.radioLimpezaRegular:
                baseCalculoLimpeza = baseCalculo + 1;
                break;
            case R.id.radioLimpezaNaoOk:
                baseCalculoLimpeza = 0;
                break;
        }

        radioPadronizaçao = (RadioGroup) findViewById(R.id.radio_padronizaçao);
        switch (radioPadronizaçao.getCheckedRadioButtonId()) {
            case R.id.radioPadronizaçaoOk:
                baseCalculoPadronizaçao = baseCalculo + 2;
                break;
            case R.id.radioPadronizaçaoRegular:
                baseCalculoPadronizaçao = baseCalculo + 1;
                break;
            case R.id.radioPadronizaçaoNaoOk:
                baseCalculoPadronizaçao = 0;
                break;
        }

        radioDisciplina = (RadioGroup) findViewById(R.id.radio_disciplina);
        switch (radioDisciplina.getCheckedRadioButtonId()) {
            case R.id.radioDisciplinaOk:
                baseCalculoDisciplina = baseCalculo + 2;
                break;
            case R.id.radioDisciplinaRegular:
                baseCalculoDisciplina = baseCalculo + 1;
                break;
            case R.id.radioDisciplinaNaoOk:
                baseCalculoDisciplina = 0;
                break;
        }

        /**
         * Este retorno é o calculo sobre as respostas.
         */

        return (quantity * (baseCalculoUtilizaçao + baseCalculoOrganizaçao + baseCalculoLimpeza +
                baseCalculoPadronizaçao + baseCalculoDisciplina)) / 10;
    }


    public void nota(View view) {
        /**Este check box serve para colocar a caixa de seleção, o boolean é chamado para verificar
         *  no id que foi colocado no findViewById, trazendo assim o valor verdadeiro ou falso.
         *  Neste caso somente é colocado para verificar se respondeu ou não a questão.
         */

        EditText campoNome = (EditText) findViewById(R.id.campo_nome);
        String nome = campoNome.getText().toString();

        EditText observaçaoUtilizaçaoField = (EditText) findViewById(R.id.observaçoes_utilizaçao);
        String observaUtiliza = observaçaoUtilizaçaoField.getText().toString();

        EditText observaçaoOrganizaçaoField = (EditText) findViewById(R.id.observaçoes_organizaçao);
        String observaOrganiza = observaçaoOrganizaçaoField.getText().toString();

        EditText observaçaoLimpezaField = (EditText) findViewById(R.id.observaçoes_limpeza);
        String observalimpa = observaçaoLimpezaField.getText().toString();

        EditText observaçaoPadronizaçaoField = (EditText) findViewById(R.id.observaçoes_padronizaçao);
        String observaPadroniza = observaçaoPadronizaçaoField.getText().toString();

        EditText observaçaoDisciplinaField = (EditText) findViewById(R.id.observaçoes_disciplina);
        String observaDisciplina = observaçaoDisciplinaField.getText().toString();

        RadioGroup radioUtilizaçao = (RadioGroup) findViewById(R.id.radio_utilizaçao);
        boolean hasRadioUtilizaçao = radioUtilizaçao.isSelected();

        RadioGroup radioOrganizaçao = (RadioGroup) findViewById(R.id.radio_organizaçao);
        boolean hasRadioOrganizaçao = radioOrganizaçao.isSelected();

        RadioGroup radioLimpeza = (RadioGroup) findViewById(R.id.radio_limpeza);
        boolean hasRadioLimpeza = radioLimpeza.isSelected();

        RadioGroup radioPadronizaçao = (RadioGroup) findViewById(R.id.radio_padronizaçao);
        boolean hasRadioPadronizaçao = radioPadronizaçao.isSelected();

        RadioGroup radioDisciplina = (RadioGroup) findViewById(R.id.radio_disciplina);
        boolean hasRadioDisciplina = radioDisciplina.isSelected();

        CheckBox respondidoUtilizaçaoCheckBox = (CheckBox) findViewById(R.id.respondido_utilizaçao_checkbox);
        boolean hasRespondidoUtilizaçao = respondidoUtilizaçaoCheckBox.isChecked();

        CheckBox respondidoOrganizaçaoCheckBox = (CheckBox) findViewById(R.id.respondido_organizaçao_checkbox);
        boolean hasRespondidoOrganizaçao = respondidoOrganizaçaoCheckBox.isChecked();

        CheckBox respondidoLimpezaCheckBox = (CheckBox) findViewById(R.id.respondido_limpeza_checkbox);
        boolean hasRespondidoLimpeza = respondidoLimpezaCheckBox.isChecked();

        CheckBox respondidoPadronizaçaoCheckBox = (CheckBox) findViewById(R.id.respondido_padronizaçao_checkbox);
        boolean hasRespondidoPadronizaçao = respondidoPadronizaçaoCheckBox.isChecked();

        CheckBox respondidoDisciplinaCheckBox = (CheckBox) findViewById(R.id.respondido_disciplina_checkbox);
        boolean hasRespondidoDisciplina = respondidoDisciplinaCheckBox.isChecked();


        /**
         * Este Resultado chama o calculo que será utilizado e mostrado no e-mail
         */

        int resultado = createResultado(radioUtilizaçao, radioOrganizaçao, radioLimpeza,
                radioPadronizaçao, radioDisciplina);
        String resultadoMessage = resultadoSummaryTextView(nome, observaUtiliza, observaOrganiza, observalimpa,
                observaPadroniza, observaDisciplina, resultado, hasRespondidoUtilizaçao,
                hasRespondidoOrganizaçao, hasRespondidoLimpeza, hasRespondidoPadronizaçao, hasRespondidoDisciplina);


        /**
         * Este Intent chama a o e-mail, onde serão colocados os dados, como o nome do setor,
         * no corpo do e-mail e dará os dados do que foi visto na auditoria.
         */
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, "Auditoria do setor " + nome);
        intent.putExtra(Intent.EXTRA_TEXT, resultadoMessage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }


        /**
         * Esta menssagem de Toast, somente serve para lembrar se a pessoa selecionou tudo.
         */
        Toast.makeText(this, "Verificar se está tudo selecionado",
                Toast.LENGTH_SHORT).show();

        displayMessage(resultadoMessage);
        {

        }
    }

    /**
     * Estes códigos são o que irá na menssagem do e-mail.
     *
     * @param nome
     * @param observaUtiliza
     * @param observaOrganiza
     * @param observalimpa
     * @param observaPadroniza
     * @param observaDisciplina
     * @param resultado
     * @param hasRespondidoUtilizaçao
     * @param hasRespondidoOrganizaçao
     * @param hasRespondidoLimpeza
     * @param hasRespondidoPadonizaçao
     * @param hasRespondidoDisciplina  @return
     */

    private String resultadoSummaryTextView(String nome, String observaUtiliza, String observaOrganiza,
                                            String observalimpa, String observaPadroniza, String
                                                    observaDisciplina, int resultado,
                                            boolean hasRespondidoUtilizaçao,
                                            boolean hasRespondidoOrganizaçao, boolean hasRespondidoLimpeza
            , boolean hasRespondidoPadonizaçao, boolean hasRespondidoDisciplina) {
        String resultadoMessage = "Setor : " + nome;
        resultadoMessage += "\n ";
        resultadoMessage += "\nNota: " + resultado + " %";
        resultadoMessage += "\n ";
        resultadoMessage += "\n";
        resultadoMessage += "\nSeleção da Utilização = " + hasRespondidoUtilizaçao +
                " Observação: " + observaUtiliza;
        resultadoMessage += "\n ";
        resultadoMessage += "\nSeleção da Organização = " + hasRespondidoOrganizaçao +
                " Observação: " + observaOrganiza;
        resultadoMessage += "\n ";
        resultadoMessage += "\nSeleção da Limpeza = " + hasRespondidoLimpeza +
                " Observação: " + observalimpa;
        resultadoMessage += "\n ";
        resultadoMessage += "\nSeleção da Padronização = " + hasRespondidoPadonizaçao +
                " Observação: " + observaPadroniza;
        resultadoMessage += "\n ";
        resultadoMessage += "\n\nSeleção da Disciplina = " + hasRespondidoDisciplina +
                " Observação: " + observaDisciplina;

        return resultadoMessage;
    }


    private void displayMessage(String message) {
        TextView resultadoSummaryTextView = (TextView) findViewById(R.id.resultado_summary_text_view);
        resultadoSummaryTextView.setText(message);
    }


    /**
     * Esta parte do código nos serve para orientar pelos menssagem TOAST ao usuario para saber
     * o que esta selecionando.
     *
     * @param view
     */

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        Toast.makeText(this, "Você selecionou Ok na Utilização",
                Toast.LENGTH_SHORT).show();

    }

    public void onRadioButtonClicked1(View view) {
        boolean checked1 = ((RadioButton) view).isChecked();
        Toast.makeText(this, "Você selecionou Regular na Utilização, favor preencher o campo de observação.",
                Toast.LENGTH_SHORT).show();
    }

    public void onRadioButtonClicked2(View view) {
        boolean checked2 = ((RadioButton) view).isChecked();
        Toast.makeText(this, "Você selecionou Não Ok na Utilização, favor preencher o campo de observação.",
                Toast.LENGTH_SHORT).show();
    }

    public void onRadioButtonClicked3(View view) {
        boolean checked3 = ((RadioButton) view).isChecked();
        Toast.makeText(this, "Você selecionou Ok na Organização",
                Toast.LENGTH_SHORT).show();
    }

    public void onRadioButtonClicked4(View view) {
        boolean checked4 = ((RadioButton) view).isChecked();
        Toast.makeText(this, "Você selecionou Regular na Organização, favor preencher o campo de observação.",
                Toast.LENGTH_SHORT).show();
    }

    public void onRadioButtonClicked5(View view) {
        boolean checked5 = ((RadioButton) view).isChecked();
        Toast.makeText(this, "Você selecionou Não Ok na Organização, favor preencher o campo de observação.",
                Toast.LENGTH_SHORT).show();
    }

    public void onRadioButtonClicked6(View view) {
        boolean checked6 = ((RadioButton) view).isChecked();
        Toast.makeText(this, "Você selecionou Ok na Limpeza",
                Toast.LENGTH_SHORT).show();
    }

    public void onRadioButtonClicked7(View view) {
        boolean checked7 = ((RadioButton) view).isChecked();
        Toast.makeText(this, "Você selecionou Regular na Limpeza, favor preencher o campo de observação.",
                Toast.LENGTH_SHORT).show();
    }

    public void onRadioButtonClicked8(View view) {
        boolean checked8 = ((RadioButton) view).isChecked();
        Toast.makeText(this, "Você selecionou Não Ok na Limpeza, favor preencher o campo de observação.",
                Toast.LENGTH_SHORT).show();
    }

    public void onRadioButtonClicked9(View view) {
        boolean checked9 = ((RadioButton) view).isChecked();
        Toast.makeText(this, "Você selecionou Ok na Padronização",
                Toast.LENGTH_SHORT).show();
    }

    public void onRadioButtonClicked10(View view) {
        boolean checked10 = ((RadioButton) view).isChecked();
        Toast.makeText(this, "Você selecionou Regular na Padronização, favor preencher o campo de observação.",
                Toast.LENGTH_SHORT).show();
    }

    public void onRadioButtonClicked11(View view) {
        boolean checked11 = ((RadioButton) view).isChecked();
        Toast.makeText(this, "Você selecionou Não Ok na Padronização, favor preencher o campo de observação.",
                Toast.LENGTH_SHORT).show();
    }

    public void onRadioButtonClicked12(View view) {
        boolean checked12 = ((RadioButton) view).isChecked();
        Toast.makeText(this, "Você selecionou Ok na Disciplina",
                Toast.LENGTH_SHORT).show();
    }

    public void onRadioButtonClicked13(View view) {
        boolean checked13 = ((RadioButton) view).isChecked();
        Toast.makeText(this, "Você selecionou Regular na Disciplina, favor preencher o campo de observação.",
                Toast.LENGTH_SHORT).show();
    }

    public void onRadioButtonClicked14(View view) {
        boolean checked14 = ((RadioButton) view).isChecked();
        Toast.makeText(this, "Você selecionou Não Ok na Disciplina, favor preencher o campo de observação.",
                Toast.LENGTH_SHORT).show();
    }
}
