.class public final synthetic Ls1/g0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp3/q$a;


# instance fields
.field public final synthetic a:Ls1/m2;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Ls1/m2;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls1/g0;->a:Ls1/m2;

    iput p2, p0, Ls1/g0;->b:I

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Ls1/g0;->a:Ls1/m2;

    iget v1, p0, Ls1/g0;->b:I

    check-cast p1, Ls1/p2$d;

    invoke-static {v0, v1, p1}, Ls1/w0;->h0(Ls1/m2;ILs1/p2$d;)V

    return-void
.end method
