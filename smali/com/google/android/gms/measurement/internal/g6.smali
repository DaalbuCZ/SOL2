.class final Lcom/google/android/gms/measurement/internal/g6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic n:Z

.field final synthetic o:Landroid/net/Uri;

.field final synthetic p:Ljava/lang/String;

.field final synthetic q:Ljava/lang/String;

.field final synthetic r:Lcom/google/android/gms/measurement/internal/h6;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/h6;ZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/g6;->r:Lcom/google/android/gms/measurement/internal/h6;

    iput-boolean p2, p0, Lcom/google/android/gms/measurement/internal/g6;->n:Z

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/g6;->o:Landroid/net/Uri;

    iput-object p4, p0, Lcom/google/android/gms/measurement/internal/g6;->p:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/measurement/internal/g6;->q:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 17

    move-object/from16 v1, p0

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/g6;->r:Lcom/google/android/gms/measurement/internal/h6;

    iget-boolean v0, v1, Lcom/google/android/gms/measurement/internal/g6;->n:Z

    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/g6;->o:Landroid/net/Uri;

    iget-object v4, v1, Lcom/google/android/gms/measurement/internal/g6;->p:Ljava/lang/String;

    iget-object v5, v1, Lcom/google/android/gms/measurement/internal/g6;->q:Ljava/lang/String;

    iget-object v6, v2, Lcom/google/android/gms/measurement/internal/h6;->n:Lcom/google/android/gms/measurement/internal/i6;

    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    :try_start_0
    iget-object v6, v2, Lcom/google/android/gms/measurement/internal/h6;->n:Lcom/google/android/gms/measurement/internal/i6;

    iget-object v6, v6, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/j4;->N()Lcom/google/android/gms/measurement/internal/i9;

    move-result-object v6

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v8, "Activity created with data \'referrer\' without required params"

    const-string v9, "utm_medium"

    const-string v10, "_cis"

    const-string v11, "utm_source"

    const-string v12, "utm_campaign"

    const/4 v13, 0x0

    const-string v14, "gclid"

    if-eqz v7, :cond_0

    :goto_0
    move-object v6, v13

    goto :goto_1

    :cond_0
    :try_start_1
    invoke-virtual {v5, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_1

    invoke-virtual {v5, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_1

    invoke-virtual {v5, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_1

    invoke-virtual {v5, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_1

    const-string v7, "utm_id"

    invoke-virtual {v5, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_1

    const-string v7, "dclid"

    invoke-virtual {v5, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_1

    const-string v7, "srsltid"

    invoke-virtual {v5, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_1

    iget-object v6, v6, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/j4;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/f3;->q()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v6

    invoke-virtual {v6, v8}, Lcom/google/android/gms/measurement/internal/d3;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const-string v7, "https://google.com/search?"

    invoke-virtual {v7, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/google/android/gms/measurement/internal/i9;->t0(Landroid/net/Uri;)Landroid/os/Bundle;

    move-result-object v6

    if-eqz v6, :cond_2

    const-string v7, "referrer"

    invoke-virtual {v6, v10, v7}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    :cond_2
    :goto_1
    const-string v7, "_cmp"

    const/4 v15, 0x1

    if-eqz v0, :cond_4

    :try_start_2
    iget-object v0, v2, Lcom/google/android/gms/measurement/internal/h6;->n:Lcom/google/android/gms/measurement/internal/i6;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/j4;->N()Lcom/google/android/gms/measurement/internal/i9;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/google/android/gms/measurement/internal/i9;->t0(Landroid/net/Uri;)Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_4

    const-string v3, "intent"

    invoke-virtual {v0, v10, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v14}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_3

    if-eqz v6, :cond_3

    invoke-virtual {v6, v14}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    new-array v3, v15, [Ljava/lang/Object;

    const/4 v10, 0x0

    invoke-virtual {v6, v14}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    aput-object v16, v3, v10

    const-string v10, "_cer"

    const-string v15, "gclid=%s"

    invoke-static {v15, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v10, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    iget-object v3, v2, Lcom/google/android/gms/measurement/internal/h6;->n:Lcom/google/android/gms/measurement/internal/i6;

    invoke-virtual {v3, v4, v7, v0}, Lcom/google/android/gms/measurement/internal/i6;->u(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    iget-object v3, v2, Lcom/google/android/gms/measurement/internal/h6;->n:Lcom/google/android/gms/measurement/internal/i6;

    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/i6;->n:Lcom/google/android/gms/measurement/internal/p9;

    invoke-virtual {v3, v4, v0}, Lcom/google/android/gms/measurement/internal/p9;->a(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_4
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    goto/16 :goto_3

    :cond_5
    iget-object v0, v2, Lcom/google/android/gms/measurement/internal/h6;->n:Lcom/google/android/gms/measurement/internal/i6;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/j4;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/f3;->q()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v0

    const-string v3, "Activity created with referrer"

    invoke-virtual {v0, v3, v5}, Lcom/google/android/gms/measurement/internal/d3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, v2, Lcom/google/android/gms/measurement/internal/h6;->n:Lcom/google/android/gms/measurement/internal/i6;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/j4;->z()Lcom/google/android/gms/measurement/internal/h;

    move-result-object v0

    sget-object v3, Lcom/google/android/gms/measurement/internal/u2;->a0:Lcom/google/android/gms/measurement/internal/t2;

    invoke-virtual {v0, v13, v3}, Lcom/google/android/gms/measurement/internal/h;->B(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/t2;)Z

    move-result v0
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0

    const-string v3, "_ldl"

    const-string v10, "auto"

    if-eqz v0, :cond_7

    if-eqz v6, :cond_6

    :try_start_3
    iget-object v0, v2, Lcom/google/android/gms/measurement/internal/h6;->n:Lcom/google/android/gms/measurement/internal/i6;

    invoke-virtual {v0, v4, v7, v6}, Lcom/google/android/gms/measurement/internal/i6;->u(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    iget-object v0, v2, Lcom/google/android/gms/measurement/internal/h6;->n:Lcom/google/android/gms/measurement/internal/i6;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/i6;->n:Lcom/google/android/gms/measurement/internal/p9;

    invoke-virtual {v0, v4, v6}, Lcom/google/android/gms/measurement/internal/p9;->a(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_2

    :cond_6
    iget-object v0, v2, Lcom/google/android/gms/measurement/internal/h6;->n:Lcom/google/android/gms/measurement/internal/i6;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/j4;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/f3;->q()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v0

    const-string v4, "Referrer does not contain valid parameters"

    invoke-virtual {v0, v4, v5}, Lcom/google/android/gms/measurement/internal/d3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_2
    iget-object v0, v2, Lcom/google/android/gms/measurement/internal/h6;->n:Lcom/google/android/gms/measurement/internal/i6;

    const/4 v4, 0x1

    invoke-virtual {v0, v10, v3, v13, v4}, Lcom/google/android/gms/measurement/internal/i6;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    return-void

    :cond_7
    invoke-virtual {v5, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {v5, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_8

    invoke-virtual {v5, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_8

    invoke-virtual {v5, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_8

    const-string v0, "utm_term"

    invoke-virtual {v5, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_8

    const-string v0, "utm_content"

    invoke-virtual {v5, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_a

    :cond_8
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_9

    iget-object v0, v2, Lcom/google/android/gms/measurement/internal/h6;->n:Lcom/google/android/gms/measurement/internal/i6;

    const/4 v4, 0x1

    invoke-virtual {v0, v10, v3, v5, v4}, Lcom/google/android/gms/measurement/internal/i6;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    :cond_9
    :goto_3
    return-void

    :cond_a
    iget-object v0, v2, Lcom/google/android/gms/measurement/internal/h6;->n:Lcom/google/android/gms/measurement/internal/i6;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/j4;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/f3;->q()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v0

    invoke-virtual {v0, v8}, Lcom/google/android/gms/measurement/internal/d3;->a(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/h6;->n:Lcom/google/android/gms/measurement/internal/i6;

    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/j4;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v2

    const-string v3, "Throwable caught in handleReferrerForOnActivityCreated"

    invoke-virtual {v2, v3, v0}, Lcom/google/android/gms/measurement/internal/d3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
