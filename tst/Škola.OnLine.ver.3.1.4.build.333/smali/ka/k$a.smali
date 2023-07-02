.class public final Lka/k$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lka/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ls9/g;)V
    .locals 0

    invoke-direct {p0}, Lka/k$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Lka/k;
    .locals 2

    invoke-static {}, Lka/k;->a()Lka/k;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lka/k;

    invoke-static {p1}, Ls9/k;->b(Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v1, "ctx!!.applicationContext"

    invoke-static {p1, v1}, Ls9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lka/k;-><init>(Landroid/content/Context;Ls9/g;)V

    invoke-static {v0}, Lka/k;->b(Lka/k;)V

    :cond_0
    invoke-static {}, Lka/k;->a()Lka/k;

    move-result-object p1

    invoke-static {p1}, Ls9/k;->b(Ljava/lang/Object;)V

    return-object p1
.end method
