.class public final synthetic Ln1/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp1/b$a;


# instance fields
.field public final synthetic a:Ln1/s;


# direct methods
.method public synthetic constructor <init>(Ln1/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln1/j;->a:Ln1/s;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ln1/j;->a:Ln1/s;

    invoke-static {v0}, Ln1/s;->i(Ln1/s;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
