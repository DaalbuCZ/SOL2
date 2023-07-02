.class public Ld1/x0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ld1/n;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ld1/n<",
        "Ld1/n0;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Ld1/x0;->c(Ljava/lang/String;)Ld1/n0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ld1/n0;

    invoke-virtual {p0, p1}, Ld1/x0;->d(Ld1/n0;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/String;)Ld1/n0;
    .locals 14

    const-string v0, "th"

    const-string v1, "thn"

    const-string v2, "text"

    const-string v3, "file"

    const-string v4, "method"

    const-string v5, "tag"

    const/4 v6, 0x0

    :try_start_0
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p1, "line"

    invoke-virtual {v7, p1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p1

    const-string v8, "level"

    invoke-virtual {v7, v8}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v8

    const-string v9, "absoluteTime"

    invoke-virtual {v7, v9}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v9

    const-string v11, "date"

    invoke-virtual {v7, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-static {}, Ld1/u;->c()Ld1/u;

    move-result-object v12

    invoke-virtual {v12, v11}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v11
    :try_end_1
    .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_0
    move-object v11, v6

    :goto_0
    :try_start_2
    invoke-virtual {v7, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v12
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    const-string v13, ""

    if-eqz v12, :cond_0

    :try_start_3
    invoke-virtual {v7, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :cond_0
    move-object v5, v13

    :goto_1
    invoke-virtual {v7, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_1

    invoke-virtual {v7, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_2

    :cond_1
    move-object v4, v13

    :goto_2
    invoke-virtual {v7, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_2

    invoke-virtual {v7, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_3

    :cond_2
    move-object v3, v13

    :goto_3
    invoke-virtual {v7, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_3

    invoke-virtual {v7, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_4

    :cond_3
    move-object v2, v13

    :goto_4
    invoke-virtual {v7, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_4

    invoke-virtual {v7, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_5

    :cond_4
    move-object v1, v13

    :goto_5
    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_5

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    :cond_5
    new-instance v0, Ld1/n0$b;

    invoke-direct {v0}, Ld1/n0$b;-><init>()V

    invoke-virtual {v0, p1}, Ld1/n0$b;->f(I)Ld1/n0$b;

    move-result-object p1

    invoke-virtual {p1, v8}, Ld1/n0$b;->a(I)Ld1/n0$b;

    move-result-object p1

    invoke-virtual {p1, v9, v10}, Ld1/n0$b;->b(J)Ld1/n0$b;

    move-result-object p1

    invoke-virtual {p1, v11}, Ld1/n0$b;->d(Ljava/util/Date;)Ld1/n0$b;

    move-result-object p1

    invoke-virtual {p1, v5}, Ld1/n0$b;->h(Ljava/lang/String;)Ld1/n0$b;

    move-result-object p1

    invoke-virtual {p1, v4}, Ld1/n0$b;->g(Ljava/lang/String;)Ld1/n0$b;

    move-result-object p1

    invoke-virtual {p1, v3}, Ld1/n0$b;->c(Ljava/lang/String;)Ld1/n0$b;

    move-result-object p1

    invoke-virtual {p1, v2}, Ld1/n0$b;->i(Ljava/lang/String;)Ld1/n0$b;

    move-result-object p1

    invoke-virtual {p1, v1}, Ld1/n0$b;->k(Ljava/lang/String;)Ld1/n0$b;

    move-result-object p1

    invoke-virtual {p1, v13}, Ld1/n0$b;->j(Ljava/lang/String;)Ld1/n0$b;

    move-result-object p1

    invoke-virtual {p1}, Ld1/n0$b;->e()Ld1/n0;

    move-result-object p1
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_1

    return-object p1

    :catch_1
    return-object v6
.end method

.method public d(Ld1/n0;)Ljava/lang/String;
    .locals 4

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "line"

    invoke-virtual {p1}, Ld1/n0;->e()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "level"

    invoke-virtual {p1}, Ld1/n0;->d()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "absoluteTime"

    invoke-virtual {p1}, Ld1/n0;->a()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v1, "date"

    invoke-static {}, Ld1/u;->c()Ld1/u;

    move-result-object v2

    invoke-virtual {p1}, Ld1/n0;->b()Ljava/util/Date;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {p1}, Ld1/n0;->g()Ljava/lang/String;

    move-result-object v1

    const-string v2, "tag"
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v3, ""

    if-nez v1, :cond_0

    move-object v1, v3

    :cond_0
    :try_start_1
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {p1}, Ld1/n0;->f()Ljava/lang/String;

    move-result-object v1

    const-string v2, "method"

    if-nez v1, :cond_1

    move-object v1, v3

    :cond_1
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {p1}, Ld1/n0;->c()Ljava/lang/String;

    move-result-object v1

    const-string v2, "file"

    if-nez v1, :cond_2

    move-object v1, v3

    :cond_2
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {p1}, Ld1/n0;->h()Ljava/lang/String;

    move-result-object v1

    const-string v2, "text"

    if-nez v1, :cond_3

    move-object v1, v3

    :cond_3
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {p1}, Ld1/n0;->j()Ljava/lang/String;

    move-result-object v1

    const-string v2, "thn"

    if-nez v1, :cond_4

    move-object v1, v3

    :cond_4
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {p1}, Ld1/n0;->i()Ljava/lang/String;

    move-result-object p1

    const-string v1, "th"

    if-nez p1, :cond_5

    goto :goto_0

    :cond_5
    move-object v3, p1

    :goto_0
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-static {p1}, Ld1/i0;->c(Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    return-object p1
.end method
