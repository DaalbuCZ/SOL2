.class public final synthetic Lo2/s;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo2/v$g;


# instance fields
.field public final synthetic a:Lx1/n1;


# direct methods
.method public synthetic constructor <init>(Lx1/n1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo2/s;->a:Lx1/n1;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Lo2/s;->a:Lx1/n1;

    check-cast p1, Lo2/n;

    invoke-static {v0, p1}, Lo2/v;->c(Lx1/n1;Lo2/n;)I

    move-result p1

    return p1
.end method
