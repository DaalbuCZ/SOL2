.class public Lb9/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lk8/a;


# instance fields
.field private n:Lt8/k;

.field private o:Lb9/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Lt8/c;Landroid/content/Context;)V
    .locals 2

    new-instance v0, Lt8/k;

    const-string v1, "plugins.flutter.io/shared_preferences_android"

    invoke-direct {v0, p1, v1}, Lt8/k;-><init>(Lt8/c;Ljava/lang/String;)V

    iput-object v0, p0, Lb9/b;->n:Lt8/k;

    new-instance p1, Lb9/a;

    invoke-direct {p1, p2}, Lb9/a;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lb9/b;->o:Lb9/a;

    iget-object p2, p0, Lb9/b;->n:Lt8/k;

    invoke-virtual {p2, p1}, Lt8/k;->e(Lt8/k$c;)V

    return-void
.end method

.method private b()V
    .locals 2

    iget-object v0, p0, Lb9/b;->o:Lb9/a;

    invoke-virtual {v0}, Lb9/a;->f()V

    const/4 v0, 0x0

    iput-object v0, p0, Lb9/b;->o:Lb9/a;

    iget-object v1, p0, Lb9/b;->n:Lt8/k;

    invoke-virtual {v1, v0}, Lt8/k;->e(Lt8/k$c;)V

    iput-object v0, p0, Lb9/b;->n:Lt8/k;

    return-void
.end method


# virtual methods
.method public onAttachedToEngine(Lk8/a$b;)V
    .locals 1

    invoke-virtual {p1}, Lk8/a$b;->b()Lt8/c;

    move-result-object v0

    invoke-virtual {p1}, Lk8/a$b;->a()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lb9/b;->a(Lt8/c;Landroid/content/Context;)V

    return-void
.end method

.method public onDetachedFromEngine(Lk8/a$b;)V
    .locals 0

    invoke-direct {p0}, Lb9/b;->b()V

    return-void
.end method
