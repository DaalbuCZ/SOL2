.class public final Lcom/google/firebase/iid/Registrar;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/iid/Registrar$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static final synthetic lambda$getComponents$0$Registrar(Lk5/e;)Lcom/google/firebase/iid/FirebaseInstanceId;
    .locals 5

    new-instance v0, Lcom/google/firebase/iid/FirebaseInstanceId;

    const-class v1, Lf5/e;

    invoke-interface {p0, v1}, Lk5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf5/e;

    const-class v2, Lc7/i;

    invoke-interface {p0, v2}, Lk5/e;->f(Ljava/lang/Class;)Li6/b;

    move-result-object v2

    const-class v3, Lg6/j;

    invoke-interface {p0, v3}, Lk5/e;->f(Ljava/lang/Class;)Li6/b;

    move-result-object v3

    const-class v4, Lj6/e;

    invoke-interface {p0, v4}, Lk5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lj6/e;

    invoke-direct {v0, v1, v2, v3, p0}, Lcom/google/firebase/iid/FirebaseInstanceId;-><init>(Lf5/e;Li6/b;Li6/b;Lj6/e;)V

    return-object v0
.end method

.method static final synthetic lambda$getComponents$1$Registrar(Lk5/e;)Lh6/a;
    .locals 2

    new-instance v0, Lcom/google/firebase/iid/Registrar$a;

    const-class v1, Lcom/google/firebase/iid/FirebaseInstanceId;

    invoke-interface {p0, v1}, Lk5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/firebase/iid/FirebaseInstanceId;

    invoke-direct {v0, p0}, Lcom/google/firebase/iid/Registrar$a;-><init>(Lcom/google/firebase/iid/FirebaseInstanceId;)V

    return-object v0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 5
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lk5/c<",
            "*>;>;"
        }
    .end annotation

    const-class v0, Lcom/google/firebase/iid/FirebaseInstanceId;

    invoke-static {v0}, Lk5/c;->c(Ljava/lang/Class;)Lk5/c$b;

    move-result-object v1

    const-class v2, Lf5/e;

    invoke-static {v2}, Lk5/r;->j(Ljava/lang/Class;)Lk5/r;

    move-result-object v2

    invoke-virtual {v1, v2}, Lk5/c$b;->b(Lk5/r;)Lk5/c$b;

    move-result-object v1

    const-class v2, Lc7/i;

    invoke-static {v2}, Lk5/r;->i(Ljava/lang/Class;)Lk5/r;

    move-result-object v2

    invoke-virtual {v1, v2}, Lk5/c$b;->b(Lk5/r;)Lk5/c$b;

    move-result-object v1

    const-class v2, Lg6/j;

    invoke-static {v2}, Lk5/r;->i(Ljava/lang/Class;)Lk5/r;

    move-result-object v2

    invoke-virtual {v1, v2}, Lk5/c$b;->b(Lk5/r;)Lk5/c$b;

    move-result-object v1

    const-class v2, Lj6/e;

    invoke-static {v2}, Lk5/r;->j(Ljava/lang/Class;)Lk5/r;

    move-result-object v2

    invoke-virtual {v1, v2}, Lk5/c$b;->b(Lk5/r;)Lk5/c$b;

    move-result-object v1

    sget-object v2, Lcom/google/firebase/iid/o;->a:Lk5/h;

    invoke-virtual {v1, v2}, Lk5/c$b;->f(Lk5/h;)Lk5/c$b;

    move-result-object v1

    invoke-virtual {v1}, Lk5/c$b;->c()Lk5/c$b;

    move-result-object v1

    invoke-virtual {v1}, Lk5/c$b;->d()Lk5/c;

    move-result-object v1

    const-class v2, Lh6/a;

    invoke-static {v2}, Lk5/c;->c(Ljava/lang/Class;)Lk5/c$b;

    move-result-object v2

    invoke-static {v0}, Lk5/r;->j(Ljava/lang/Class;)Lk5/r;

    move-result-object v0

    invoke-virtual {v2, v0}, Lk5/c$b;->b(Lk5/r;)Lk5/c$b;

    move-result-object v0

    sget-object v2, Lcom/google/firebase/iid/p;->a:Lk5/h;

    invoke-virtual {v0, v2}, Lk5/c$b;->f(Lk5/h;)Lk5/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lk5/c$b;->d()Lk5/c;

    move-result-object v0

    const-string v2, "fire-iid"

    const-string v3, "21.1.0"

    invoke-static {v2, v3}, Lc7/h;->b(Ljava/lang/String;Ljava/lang/String;)Lk5/c;

    move-result-object v2

    const/4 v3, 0x3

    new-array v3, v3, [Lk5/c;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v1, 0x1

    aput-object v0, v3, v1

    const/4 v0, 0x2

    aput-object v2, v3, v0

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
