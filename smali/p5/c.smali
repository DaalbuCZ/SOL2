.class public Lp5/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp5/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lp5/a;)V
    .locals 1

    invoke-static {}, Ln5/f;->f()Ln5/f;

    move-result-object p1

    const-string v0, "Could not register handler for breadcrumbs events."

    invoke-virtual {p1, v0}, Ln5/f;->b(Ljava/lang/String;)V

    return-void
.end method
