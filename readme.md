# ⚙️ Configuração de Ambiente - Java 17 + IntelliJ + Postman

Este guia rápido irá te ajudar a configurar seu ambiente de desenvolvimento com JDK 17, IntelliJ IDEA e Postman.

---

## ☕ Instalar JDK 17

### Windows / Linux / MacOS:

1. Acesse: https://jdk.java.net/17/
2. Baixe a versão compatível com seu sistema operacional.
3. Siga as instruções de instalação.

### Verifique a instalação:

```bash
java -version
```

Você deve ver algo como:

```
java 17.0.x
```

---

## 🧠 Instalar IntelliJ IDEA

1. Acesse: https://www.jetbrains.com/idea/
2. Baixe a versão **Community** (gratuita) ou **Ultimate** (completo).
3. Instale normalmente e abra o programa.
4. Ao iniciar, configure o **JDK 17** nas configurações do projeto:
   - File > Project Structure > SDKs > Add JDK > selecione a pasta do JDK 17.

---

## 📬 Instalar Postman

1. Acesse: https://www.postman.com/downloads/
2. Baixe a versão para seu sistema operacional.
3. Instale e faça login (ou crie uma conta gratuita).
4. Importe a coleção de requisições (`.PWD.postman_collection`)

---

✅ Tudo pronto! Agora você está com seu ambiente configurado para desenvolver, testar e consumir APIs com Java e Postman.
