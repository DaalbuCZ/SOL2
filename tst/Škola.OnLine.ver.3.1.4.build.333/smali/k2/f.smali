.class public final synthetic Lk2/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lf5/f;


# instance fields
.field public final synthetic n:Lk2/g;


# direct methods
.method public synthetic constructor <init>(Lk2/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk2/f;->n:Lk2/g;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lk2/f;->n:Lk2/g;

    check-cast p1, Lk2/o;

    invoke-virtual {v0, p1}, Lk2/g;->o(Lk2/o;)Lk2/o;

    move-result-object p1

    return-object p1
.end method
