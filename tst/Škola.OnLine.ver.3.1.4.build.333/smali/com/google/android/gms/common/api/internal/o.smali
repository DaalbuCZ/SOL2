.class final Lcom/google/android/gms/common/api/internal/o;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic n:Lb4/b;

.field final synthetic o:Lcom/google/android/gms/common/api/internal/p;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/internal/p;Lb4/b;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/o;->o:Lcom/google/android/gms/common/api/internal/p;

    iput-object p2, p0, Lcom/google/android/gms/common/api/internal/o;->n:Lb4/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/o;->o:Lcom/google/android/gms/common/api/internal/p;

    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/p;->f:Lcom/google/android/gms/common/api/internal/b;

    invoke-static {v1}, Lcom/google/android/gms/common/api/internal/b;->A(Lcom/google/android/gms/common/api/internal/b;)Ljava/util/Map;

    move-result-object v1

    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/p;->e(Lcom/google/android/gms/common/api/internal/p;)Ld4/b;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/internal/m;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/o;->n:Lb4/b;

    invoke-virtual {v1}, Lb4/b;->C()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/o;->o:Lcom/google/android/gms/common/api/internal/p;

    const/4 v3, 0x1

    invoke-static {v1, v3}, Lcom/google/android/gms/common/api/internal/p;->f(Lcom/google/android/gms/common/api/internal/p;Z)V

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/o;->o:Lcom/google/android/gms/common/api/internal/p;

    invoke-static {v1}, Lcom/google/android/gms/common/api/internal/p;->d(Lcom/google/android/gms/common/api/internal/p;)Lc4/a$f;

    move-result-object v1

    invoke-interface {v1}, Lc4/a$f;->o()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/o;->o:Lcom/google/android/gms/common/api/internal/p;

    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/p;->g(Lcom/google/android/gms/common/api/internal/p;)V

    return-void

    :cond_1
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/o;->o:Lcom/google/android/gms/common/api/internal/p;

    invoke-static {v1}, Lcom/google/android/gms/common/api/internal/p;->d(Lcom/google/android/gms/common/api/internal/p;)Lc4/a$f;

    move-result-object v3

    invoke-static {v1}, Lcom/google/android/gms/common/api/internal/p;->d(Lcom/google/android/gms/common/api/internal/p;)Lc4/a$f;

    move-result-object v1

    invoke-interface {v1}, Lc4/a$f;->c()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v3, v2, v1}, Lc4/a$f;->m(Le4/i;Ljava/util/Set;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v1

    const-string v3, "GoogleApiManager"

    const-string v4, "Failed to get service from broker. "

    invoke-static {v3, v4, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/o;->o:Lcom/google/android/gms/common/api/internal/p;

    invoke-static {v1}, Lcom/google/android/gms/common/api/internal/p;->d(Lcom/google/android/gms/common/api/internal/p;)Lc4/a$f;

    move-result-object v1

    const-string v3, "Failed to get service from broker."

    invoke-interface {v1, v3}, Lc4/a$f;->d(Ljava/lang/String;)V

    new-instance v1, Lb4/b;

    const/16 v3, 0xa

    invoke-direct {v1, v3}, Lb4/b;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/api/internal/m;->H(Lb4/b;Ljava/lang/Exception;)V

    return-void

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/o;->n:Lb4/b;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/api/internal/m;->H(Lb4/b;Ljava/lang/Exception;)V

    return-void
.end method
