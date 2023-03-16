.class public Lo5/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo5/a;


# instance fields
.field private final a:Li5/a;


# direct methods
.method public constructor <init>(Li5/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo5/e;->a:Li5/a;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lo5/e;->a:Li5/a;

    const-string v1, "clx"

    invoke-interface {v0, v1, p1, p2}, Li5/a;->f(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
