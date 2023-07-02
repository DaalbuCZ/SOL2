.class Lga/h$a;
.super Lga/h;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lga/h;->a(Lga/d;JLia/b;)Lga/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:J

.field final synthetic o:Lia/b;


# direct methods
.method constructor <init>(Lga/d;JLia/b;)V
    .locals 0

    iput-wide p2, p0, Lga/h$a;->n:J

    iput-object p4, p0, Lga/h$a;->o:Lia/b;

    invoke-direct {p0}, Lga/h;-><init>()V

    return-void
.end method


# virtual methods
.method public c()Lia/b;
    .locals 1

    iget-object v0, p0, Lga/h$a;->o:Lia/b;

    return-object v0
.end method
