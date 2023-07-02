.class public Lcom/google/firebase/datatransport/TransportRegistrar;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-transport"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lp5/e;)Lj1/g;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/datatransport/TransportRegistrar;->lambda$getComponents$0(Lp5/e;)Lj1/g;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$0(Lp5/e;)Lj1/g;
    .locals 1

    const-class v0, Landroid/content/Context;

    invoke-interface {p0, v0}, Lp5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, Ll1/u;->f(Landroid/content/Context;)V

    invoke-static {}, Ll1/u;->c()Ll1/u;

    move-result-object p0

    sget-object v0, Lcom/google/android/datatransport/cct/a;->h:Lcom/google/android/datatransport/cct/a;

    invoke-virtual {p0, v0}, Ll1/u;->g(Ll1/f;)Lj1/g;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lp5/c<",
            "*>;>;"
        }
    .end annotation

    const/4 v0, 0x2

    new-array v0, v0, [Lp5/c;

    const-class v1, Lj1/g;

    invoke-static {v1}, Lp5/c;->c(Ljava/lang/Class;)Lp5/c$b;

    move-result-object v1

    const-string v2, "fire-transport"

    invoke-virtual {v1, v2}, Lp5/c$b;->h(Ljava/lang/String;)Lp5/c$b;

    move-result-object v1

    const-class v3, Landroid/content/Context;

    invoke-static {v3}, Lp5/r;->j(Ljava/lang/Class;)Lp5/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Lp5/c$b;->b(Lp5/r;)Lp5/c$b;

    move-result-object v1

    sget-object v3, Le6/a;->a:Le6/a;

    invoke-virtual {v1, v3}, Lp5/c$b;->f(Lp5/h;)Lp5/c$b;

    move-result-object v1

    invoke-virtual {v1}, Lp5/c$b;->d()Lp5/c;

    move-result-object v1

    const/4 v3, 0x0

    aput-object v1, v0, v3

    const-string v1, "18.1.7"

    invoke-static {v2, v1}, Lh7/h;->b(Ljava/lang/String;Ljava/lang/String;)Lp5/c;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
