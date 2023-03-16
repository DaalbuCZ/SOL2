.class public Lt8/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc8/a;


# instance fields
.field private n:Ll8/k;

.field private o:Lt8/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Ll8/c;Landroid/content/Context;)V
    .locals 2

    new-instance v0, Ll8/k;

    const-string v1, "plugins.flutter.io/shared_preferences_android"

    invoke-direct {v0, p1, v1}, Ll8/k;-><init>(Ll8/c;Ljava/lang/String;)V

    iput-object v0, p0, Lt8/b;->n:Ll8/k;

    new-instance p1, Lt8/a;

    invoke-direct {p1, p2}, Lt8/a;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lt8/b;->o:Lt8/a;

    iget-object p2, p0, Lt8/b;->n:Ll8/k;

    invoke-virtual {p2, p1}, Ll8/k;->e(Ll8/k$c;)V

    return-void
.end method

.method private b()V
    .locals 2

    iget-object v0, p0, Lt8/b;->o:Lt8/a;

    invoke-virtual {v0}, Lt8/a;->f()V

    const/4 v0, 0x0

    iput-object v0, p0, Lt8/b;->o:Lt8/a;

    iget-object v1, p0, Lt8/b;->n:Ll8/k;

    invoke-virtual {v1, v0}, Ll8/k;->e(Ll8/k$c;)V

    iput-object v0, p0, Lt8/b;->n:Ll8/k;

    return-void
.end method


# virtual methods
.method public onAttachedToEngine(Lc8/a$b;)V
    .locals 1

    invoke-virtual {p1}, Lc8/a$b;->b()Ll8/c;

    move-result-object v0

    invoke-virtual {p1}, Lc8/a$b;->a()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lt8/b;->a(Ll8/c;Landroid/content/Context;)V

    return-void
.end method

.method public onDetachedFromEngine(Lc8/a$b;)V
    .locals 0

    invoke-direct {p0}, Lt8/b;->b()V

    return-void
.end method
