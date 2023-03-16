.class public final synthetic Ln3/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La5/k;


# instance fields
.field public final synthetic n:Ln3/m;


# direct methods
.method public synthetic constructor <init>(Ln3/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln3/d;->n:Ln3/m;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Ln3/d;->n:Ln3/m;

    check-cast p1, Ls1/m1;

    invoke-static {v0, p1}, Ln3/m;->n(Ln3/m;Ls1/m1;)Z

    move-result p1

    return p1
.end method
