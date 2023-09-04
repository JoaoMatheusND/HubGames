package Resources;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class Email {

    public static void main(String[] args) {
        // Configurações do servidor de email
        String host = "smtp.seuemail.com"; // Substitua pelo servidor SMTP do seu provedor de email
        String porta = "587"; // Porta do servidor SMTP (pode variar de acordo com o provedor)
        String usuario = "seuemail@provedor.com"; // Seu endereço de email
        String senha = "suasenha"; // Sua senha de email

        // Configurar as propriedades
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", porta);

        // Criar uma sessão de email com autenticação
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(usuario, senha);
            }
        });

        try {
            // Criar uma mensagem de email
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(usuario)); // Remetente
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("destinatario@provedor.com")); // Destinatário
            message.setSubject("Assunto do Email"); // Assunto
            message.setText("Este é um exemplo de email enviado via JavaMail."); // Conteúdo do email

            // Enviar o email
            Transport.send(message);

            System.out.println("Email enviado com sucesso!");

        } catch (MessagingException e) {
            e.printStackTrace();
            System.out.println("Erro ao enviar o email.");
        }
    }
}
