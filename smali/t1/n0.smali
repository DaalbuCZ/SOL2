.class public final synthetic Lt1/n0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp3/q$a;


# instance fields
.field public final synthetic a:Lt1/c$a;

.field public final synthetic b:Ls1/o2;


# direct methods
.method public synthetic constructor <init>(Lt1/c$a;Ls1/o2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt1/n0;->a:Lt1/c$a;

    iput-object p2, p0, Lt1/n0;->b:Ls1/o2;

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lt1/n0;->a:Lt1/c$a;

    iget-object v1, p0, Lt1/n0;->b:Ls1/o2;

    check-cast p1, Lt1/c;

    invoke-static {v0, v1, p1}, Lt1/o1;->F0(Lt1/c$a;Ls1/o2;Lt1/c;)V

    return-void
.end method
