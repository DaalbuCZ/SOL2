.class public final synthetic Landroidx/lifecycle/u;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lf0/c$c;


# instance fields
.field public final synthetic a:Landroidx/lifecycle/v;


# direct methods
.method public synthetic constructor <init>(Landroidx/lifecycle/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/u;->a:Landroidx/lifecycle/v;

    return-void
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/u;->a:Landroidx/lifecycle/v;

    invoke-static {v0}, Landroidx/lifecycle/v;->a(Landroidx/lifecycle/v;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method
