.class final La5/w;
.super La5/t;
.source ""


# instance fields
.field final synthetic o:La5/t;

.field final synthetic p:La5/d0;


# direct methods
.method constructor <init>(La5/d0;Ly4/j;La5/t;)V
    .locals 0

    iput-object p1, p0, La5/w;->p:La5/d0;

    iput-object p3, p0, La5/w;->o:La5/t;

    invoke-direct {p0, p2}, La5/t;-><init>(Ly4/j;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, La5/w;->p:La5/d0;

    iget-object v1, p0, La5/w;->o:La5/t;

    invoke-static {v0, v1}, La5/d0;->m(La5/d0;La5/t;)V

    return-void
.end method
