.class public final synthetic La4/z;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ly4/a;


# instance fields
.field public final synthetic a:La4/d;

.field public final synthetic b:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(La4/d;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La4/z;->a:La4/d;

    iput-object p2, p0, La4/z;->b:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final a(Ly4/i;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, La4/z;->a:La4/d;

    iget-object v1, p0, La4/z;->b:Landroid/os/Bundle;

    invoke-virtual {v0, v1, p1}, La4/d;->c(Landroid/os/Bundle;Ly4/i;)Ly4/i;

    move-result-object p1

    return-object p1
.end method
