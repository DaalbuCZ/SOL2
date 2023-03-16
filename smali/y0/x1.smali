.class public Ly0/x1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ly0/i2;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ly0/i2<",
        "Ly0/d3;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ly0/s2;


# direct methods
.method public constructor <init>(Ly0/s2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly0/x1;->a:Ly0/s2;

    return-void
.end method


# virtual methods
.method public a()Ly0/z2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ly0/z2<",
            "Ly0/d3;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ly0/x1;->a:Ly0/s2;

    invoke-interface {v0}, Ly0/s2;->f()Ly0/z2;

    move-result-object v0

    return-object v0
.end method
