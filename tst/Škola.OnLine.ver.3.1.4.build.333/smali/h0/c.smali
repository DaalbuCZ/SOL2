.class public final Lh0/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lg0/c$c;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lg0/c$b;)Lg0/c;
    .locals 4

    new-instance v0, Lh0/b;

    iget-object v1, p1, Lg0/c$b;->a:Landroid/content/Context;

    iget-object v2, p1, Lg0/c$b;->b:Ljava/lang/String;

    iget-object v3, p1, Lg0/c$b;->c:Lg0/c$a;

    iget-boolean p1, p1, Lg0/c$b;->d:Z

    invoke-direct {v0, v1, v2, v3, p1}, Lh0/b;-><init>(Landroid/content/Context;Ljava/lang/String;Lg0/c$a;Z)V

    return-object v0
.end method
