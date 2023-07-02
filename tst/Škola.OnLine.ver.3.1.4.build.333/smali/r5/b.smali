.class public final synthetic Lr5/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt5/a;


# instance fields
.field public final synthetic a:Lr5/d;


# direct methods
.method public synthetic constructor <init>(Lr5/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr5/b;->a:Lr5/d;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lr5/b;->a:Lr5/d;

    invoke-static {v0, p1, p2}, Lr5/d;->b(Lr5/d;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
