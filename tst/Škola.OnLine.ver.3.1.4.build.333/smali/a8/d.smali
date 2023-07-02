.class public final synthetic La8/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ly4/f;


# instance fields
.field public final synthetic a:La8/e;

.field public final synthetic b:Lt8/k$d;


# direct methods
.method public synthetic constructor <init>(La8/e;Lt8/k$d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La8/d;->a:La8/e;

    iput-object p2, p0, La8/d;->b:Lt8/k$d;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, La8/d;->a:La8/e;

    iget-object v1, p0, La8/d;->b:Lt8/k$d;

    check-cast p1, Lz4/a;

    invoke-static {v0, v1, p1}, La8/e;->b(La8/e;Lt8/k$d;Lz4/a;)V

    return-void
.end method
