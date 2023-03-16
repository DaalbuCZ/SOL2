.class public final synthetic Lm5/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo5/a;


# instance fields
.field public final synthetic a:Lm5/d;


# direct methods
.method public synthetic constructor <init>(Lm5/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm5/b;->a:Lm5/d;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lm5/b;->a:Lm5/d;

    invoke-static {v0, p1, p2}, Lm5/d;->b(Lm5/d;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
