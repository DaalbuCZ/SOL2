.class public final synthetic Lx1/h1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lf5/p;


# instance fields
.field public final synthetic n:Lx1/j1;


# direct methods
.method public synthetic constructor <init>(Lx1/j1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx1/h1;->n:Lx1/j1;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lx1/h1;->n:Lx1/j1;

    invoke-static {v0}, Lx1/j1;->f(Lx1/j1;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
