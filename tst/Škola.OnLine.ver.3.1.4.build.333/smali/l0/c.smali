.class public Ll0/c;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private a:Ljava/lang/String;

.field private b:[Ll0/d;


# direct methods
.method public constructor <init>(Ljava/lang/String;[Ll0/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll0/c;->a:Ljava/lang/String;

    iput-object p2, p0, Ll0/c;->b:[Ll0/d;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ll0/c;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()[Ll0/d;
    .locals 1

    iget-object v0, p0, Ll0/c;->b:[Ll0/d;

    return-object v0
.end method
